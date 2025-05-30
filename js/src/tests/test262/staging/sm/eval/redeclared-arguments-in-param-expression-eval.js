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
// Ensure there's no predefined |arguments| binding.
assert.sameValue("arguments" in this, false);

// Declare |arguments| when no pre-existing (and explicit) |arguments| bindings are present.
function f1(p = eval("var arguments")) {}
assertThrowsInstanceOf(f1, SyntaxError);

// Declare |arguments| when the function body contains an |arguments| var-binding.
function f2(p = eval("var arguments")) {
  var arguments;
}
assertThrowsInstanceOf(f2, SyntaxError);

// Declare |arguments| when the function body contains an |arguments| function declaration.
//
// <https://tc39.es/ecma262/#sec-functiondeclarationinstantiation> doesn't create the
// implicit |arguments| binding when no parameter expressions are present. This case
// may be special-cased in implementations and therefore should be tested specifically.
function f3(p = eval("var arguments")) {
  function arguments() {}
}
assertThrowsInstanceOf(f3, SyntaxError);

// Declare |arguments| when the function body contains an |arguments| lexical binding.
//
// <https://tc39.es/ecma262/#sec-functiondeclarationinstantiation> doesn't create the
// implicit |arguments| binding when no parameter expressions are present. This case
// may be special-cased in implementations and therefore should be tested specifically.
function f4(p = eval("var arguments")) {
  let arguments;
}
assertThrowsInstanceOf(f4, SyntaxError);

// Declare |arguments| when a following parameter is named |arguments|.
function f5(p = eval("var arguments"), arguments) {}
assertThrowsInstanceOf(f5, SyntaxError);

// Declare |arguments| when a preceding parameter is named |arguments|.
function f6(arguments, p = eval("var arguments")) {}
assertThrowsInstanceOf(f6, SyntaxError);


// Repeat the same kind of tests for arrow function.

// Declare |arguments| when no pre-existing |arguments| bindings are present.
var a1 = (p = eval("var arguments = 'param'")) => {
  assert.sameValue(arguments, "param");
};
a1();

// Declare |arguments| when the function body contains an |arguments| var-binding.
var a2 = (p = eval("var arguments = 'param'"), q = () => arguments) => {
  var arguments = "local";
  assert.sameValue(arguments, "local");
  assert.sameValue(q(), "param");
};
a2();

// Declare |arguments| when the function body contains an |arguments| function declaration.
var a3 = (p = eval("var arguments = 'param'"), q = () => arguments) => {
  function arguments() {}
  assert.sameValue(typeof arguments, "function");
  assert.sameValue(q(), "param");
};
a3();

// Declare |arguments| when the function body contains an |arguments| lexical binding.
var a4 = (p = eval("var arguments = 'param'"), q = () => arguments) => {
  let arguments = "local";
  assert.sameValue(arguments, "local");
  assert.sameValue(q(), "param");
};
a4();

// Declare |arguments| when a following parameter is named |arguments|.
var a5 = (p = eval("var arguments"), arguments) => {};
assertThrowsInstanceOf(a5, SyntaxError);

// Declare |arguments| when a preceding parameter is named |arguments|.
var a6 = (arguments, p = eval("var arguments")) => {};
assertThrowsInstanceOf(a6, SyntaxError);

// None of the direct eval calls introduced a global |arguments| binding.
assert.sameValue("arguments" in this, false);


reportCompare(0, 0);
