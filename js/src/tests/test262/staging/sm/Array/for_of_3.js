// Copyright (C) 2024 Mozilla Corporation. All rights reserved.
// This code is governed by the BSD license found in the LICENSE file.

/*---
includes: [sm/non262.js, sm/non262-shell.js]
flags:
  - noStrict
description: |
  pending
esid: pending
---*/
// Test corner cases of for-of iteration over Arrays.
// The current SetObject::construct method uses a ForOfIterator to extract
// values from the array, so we use that mechanism to test ForOfIterator here.

//
// Check array length increases changes during iteration.
//
function TestIncreaseArrayLength() {
    function doIter(f, arr) {
        return f(...new Set(arr));
    }

    function fun(a, b, c) {
        var result = 0;
        for (var i = 0; i < arguments.length; i++)
            result += arguments[i];
        return result;
    }

    var GET_COUNT = 0;
    function getter() {
        GET_COUNT++;
        if (GET_COUNT == MID) {
            ARR_SUM += arr.length;
            arr.push(arr.length);
        }
        return M2;
    }

    var iter = ([])[Symbol.iterator]();
    var iterProto = Object.getPrototypeOf(iter);
    var OldNext = iterProto.next;
    var NewNext = function () {
        return OldNext.apply(this, arguments);
    };

    var TRUE_SUM = 0;
    var N = 100;
    var MID = N/2;
    var M = 3;
    var arr = new Array(M);
    var ARR_SUM = 0;
    for (var j = 0; j < M; j++) {
        arr[j] = j;
        ARR_SUM += j;
    }
    var M2 = (M/2)|0;
    Object.defineProperty(arr, M2, {'get':getter});

    var sum = 0;
    for (var i = 0; i < N; i++) {
        sum += doIter(fun, arr);
        TRUE_SUM += ARR_SUM;
    }
    assert.sameValue(sum, TRUE_SUM);
}
TestIncreaseArrayLength();


reportCompare(0, 0);
