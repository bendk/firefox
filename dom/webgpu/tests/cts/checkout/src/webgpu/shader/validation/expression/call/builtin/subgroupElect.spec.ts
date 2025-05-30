export const description = `
Validation tests for subgroupElect.
`;

import { makeTestGroup } from '../../../../../../common/framework/test_group.js';
import { keysOf, objectsToRecord } from '../../../../../../common/util/data_tables.js';
import { Type, elementTypeOf, kAllScalarsAndVectors } from '../../../../../util/conversion.js';
import { ShaderValidationTest } from '../../../shader_validation_test.js';

export const g = makeTestGroup(ShaderValidationTest);

g.test('requires_subgroups')
  .desc('Validates that the subgroups feature is required')
  .params(u => u.combine('enable', [false, true] as const))
  .fn(t => {
    const wgsl = `
${t.params.enable ? 'enable subgroups;' : ''}
fn foo() {
  _ = subgroupElect();
}`;

    t.expectCompileResult(t.params.enable, wgsl);
  });

const kStages: Record<string, string> = {
  constant: `
enable subgroups;
@compute @workgroup_size(16)
fn main() {
  const x = subgroupElect();
}`,
  override: `
enable subgroups
override o = select(0, 1, subgroupElect());`,
  runtime: `
enable subgroups;
@compute @workgroup_size(16)
fn main() {
  let x = subgroupElect();
}`,
};

g.test('early_eval')
  .desc('Ensures the builtin is not able to be compile time evaluated')
  .params(u => u.combine('stage', keysOf(kStages)))
  .fn(t => {
    const code = kStages[t.params.stage];
    t.expectCompileResult(t.params.stage === 'runtime', code);
  });

g.test('must_use')
  .desc('Tests that the builtin has the @must_use attribute')
  .params(u => u.combine('must_use', [true, false] as const))
  .fn(t => {
    const wgsl = `
enable subgroups;
@compute @workgroup_size(16)
fn main() {
  ${t.params.must_use ? '_ = ' : ''}subgroupElect();
}`;

    t.expectCompileResult(t.params.must_use, wgsl);
  });

const kTypes = objectsToRecord(kAllScalarsAndVectors);

g.test('data_type')
  .desc('Validates there are no valid data parameters')
  .params(u => u.combine('type', keysOf(kTypes)))
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
  _ = subgroupElect(${type.create(0).wgsl()});
}`;

    t.expectCompileResult(false, wgsl);
  });

g.test('return_type')
  .desc('Validates return type')
  .params(u =>
    u.combine('type', keysOf(kTypes)).filter(t => {
      const type = kTypes[t.type];
      const eleType = elementTypeOf(type);
      return eleType !== Type.abstractInt && eleType !== Type.abstractFloat;
    })
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
  let res : ${type.toString()} = subgroupElect();
}`;

    t.expectCompileResult(type === Type.bool, wgsl);
  });

g.test('stage')
  .desc('validates builtin is only usable in the correct stages')
  .params(u => u.combine('stage', ['compute', 'fragment', 'vertex'] as const))
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
  _ = subgroupElect();
}

${entry}
`;

    t.expectCompileResult(t.params.stage !== 'vertex', wgsl);
  });
