// |reftest| skip-if(!this.hasOwnProperty('Atomics')||!this.hasOwnProperty('SharedArrayBuffer')||(this.hasOwnProperty('getBuildConfiguration')&&getBuildConfiguration('arm64-simulator'))) -- Atomics,SharedArrayBuffer is not enabled unconditionally, ARM64 Simulator cannot emulate atomics
// Copyright (C) 2017 Mozilla Corporation.  All rights reserved.
// This code is governed by the BSD license found in the LICENSE file.

/*---
esid: sec-atomics.store
description: >
  Test range checking of Atomics.store on arrays that allow atomic operations
includes: [testAtomics.js, testTypedArray.js]
features: [ArrayBuffer, Atomics, DataView, SharedArrayBuffer, Symbol, TypedArray]
---*/

const buffer = new SharedArrayBuffer(Int32Array.BYTES_PER_ELEMENT * 2);
const views = nonClampedIntArrayConstructors.slice();

testWithTypedArrayConstructors(function(TA) {
  const view = new TA(buffer);
  testWithAtomicsOutOfBoundsIndices(function(IdxGen) {
    assert.throws(RangeError, function() {
      Atomics.store(view, IdxGen(view), 10);
    });
  });
}, views);

reportCompare(0, 0);
