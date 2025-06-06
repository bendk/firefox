// |reftest| skip-if(!Intl.hasOwnProperty('DurationFormat')) -- Intl.DurationFormat is not enabled unconditionally
// Copyright 2022 Igalia, S.L. All rights reserved.
// This code is governed by the BSD license found in the LICENSE file.

/*---
esid: sec-intl.DurationFormat
description: >
  "constructor" property of Intl.DurationFormat.prototype.
info: |
  Intl.DurationFormat.prototype.constructor

  7 Requirements for Standard Built-in ECMAScript Objects

    Unless specified otherwise in this document, the objects, functions, and constructors
    described in this standard are subject to the generic requirements and restrictions
    specified for standard built-in ECMAScript objects in the ECMAScript 2018 Language
    Specification, 9th edition, clause 17, or successor.

  17 ECMAScript Standard Built-in Objects:

    Every other data property described in clauses 18 through 26 and in Annex B.2 has the
    attributes { [[Writable]]: true, [[Enumerable]]: false, [[Configurable]]: true }
    unless otherwise specified.

features: [Intl.DurationFormat]
includes: [propertyHelper.js]
---*/

verifyProperty(Intl.DurationFormat.prototype, "constructor", {
  writable: true,
  enumerable: false,
  configurable: true,
});

reportCompare(0, 0);
