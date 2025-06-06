export const description = `
Validation tests for subgroupAny and subgroupAll.
`;

import { makeTestGroup } from '../../../../../../common/framework/test_group.js';
import { keysOf, objectsToRecord } from '../../../../../../common/util/data_tables.js';
import { Type, elementTypeOf, kAllScalarsAndVectors } from '../../../../../util/conversion.js';
import { ShaderValidationTest } from '../../../shader_validation_test.js';

export const g = makeTestGroup(ShaderValidationTest);

const kOps = ['subgroupAny', 'subgroupAll'] as const;

g.test('requires_subgroups')
  .desc('Validates that the subgroups feature is required')
  .params(u => u.combine('enable', [false, true] as const).combine('op', kOps))
  .fn(t => {
    const wgsl = `
${t.params.enable ? 'enable subgroups;' : ''}
fn foo() {
  _ = ${t.params.op}(true);
}`;

    t.expectCompileResult(t.params.enable, wgsl);
  });

const kStages: Record<string, (op: string) => string> = {
  constant: (op: string) => {
    return `
enable subgroups;
@compute @workgroup_size(16)
fn main() {
  const x = ${op}(true);
}`;
  },
  override: (op: string) => {
    return `
enable subgroups
override o = select(0, 1, ${op}(true));`;
  },
  runtime: (op: string) => {
    return `
enable subgroups;
@compute @workgroup_size(16)
fn main() {
  let x = ${op}(true);
}`;
  },
};

g.test('early_eval')
  .desc('Ensures the builtin is not able to be compile time evaluated')
  .params(u => u.combine('stage', keysOf(kStages)).combine('op', kOps))
  .fn(t => {
    const code = kStages[t.params.stage](t.params.op);
    t.expectCompileResult(t.params.stage === 'runtime', code);
  });

g.test('must_use')
  .desc('Tests that the builtin has the @must_use attribute')
  .params(u => u.combine('must_use', [true, false] as const).combine('op', kOps))
  .fn(t => {
    const wgsl = `
enable subgroups;
@compute @workgroup_size(16)
fn main() {
  ${t.params.must_use ? '_ = ' : ''}${t.params.op}(false);
}`;

    t.expectCompileResult(t.params.must_use, wgsl);
  });

const kTypes = objectsToRecord(kAllScalarsAndVectors);

g.test('data_type')
  .desc('Validates data parameter type')
  .params(u => u.combine('type', keysOf(kTypes)).combine('op', kOps))
  .fn(t => {
    const type = kTypes[t.params.type];
    let enables = `enable subgroups;\n`;
    if (type.requiresF16()) {
      enables += `enable f16;`;
    }
    const wgsl = `
${enables}
@compute @workgroup_size(1)
fn main() {
  _ = ${t.params.op}(${type.create(0).wgsl()});
}`;

    t.expectCompileResult(type === Type.bool, wgsl);
  });

g.test('return_type')
  .desc('Validates return type')
  .params(u =>
    u
      .combine('type', keysOf(kTypes))
      .filter(t => {
        const type = kTypes[t.type];
        const eleType = elementTypeOf(type);
        return eleType !== Type.abstractInt && eleType !== Type.abstractFloat;
      })
      .combine('op', kOps)
  )
  .fn(t => {
    const type = kTypes[t.params.type];
    let enables = `enable subgroups;\n`;
    if (type.requiresF16()) {
      enables += `enable f16;`;
    }
    const wgsl = `
${enables}
@compute @workgroup_size(1)
fn main() {
  let res : ${type.toString()} = ${t.params.op}(true);
}`;

    t.expectCompileResult(type === Type.bool, wgsl);
  });

g.test('stage')
  .desc('validates builtin is only usable in the correct stages')
  .params(u => u.combine('stage', ['compute', 'fragment', 'vertex'] as const).combine('op', kOps))
  .fn(t => {
    const compute = `
@compute @workgroup_size(1)
fn main() {
  foo();
}`;

    const fragment = `
@fragment
fn main() {
  foo();
}`;

    const vertex = `
@vertex
fn main() -> @builtin(position) vec4f {
  foo();
  return vec4f();
}`;

    const entry = { compute, fragment, vertex }[t.params.stage];
    const wgsl = `
enable subgroups;
fn foo() {
  _ = ${t.params.op}(true);
}

${entry}
`;

    t.expectCompileResult(t.params.stage !== 'vertex', wgsl);
  });
