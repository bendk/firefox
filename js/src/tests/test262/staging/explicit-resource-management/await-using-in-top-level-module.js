// |reftest| shell-option(--enable-explicit-resource-management) skip-if(!(this.hasOwnProperty('getBuildConfiguration')&&getBuildConfiguration('explicit-resource-management'))||!xulRuntime.shell) module -- explicit-resource-management is not enabled unconditionally, requires shell-options
// Copyright (C) 2025 the V8 project authors. All rights reserved.
// This code is governed by the BSD license found in the LICENSE file.

/*---
description: await using should be allowed in top-level module.
flags: [module]
features: [explicit-resource-management]
---*/

await using x = {
    [Symbol.asyncDispose]() {
      return 42;
    },
};

reportCompare(0, 0);
