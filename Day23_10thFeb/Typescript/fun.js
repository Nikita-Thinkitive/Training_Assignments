"use strict";
exports.__esModule = true;
var demo;
(function (demo) {
    var x = 12;
    var y = 3;
    console.log(x + y);
    console.log(x - y);
    console.log(x * y);
    console.log(x / y);
    console.log(x % y);
    console.log(x > y);
    console.log(x < y);
    console.log(x == y);
    var s = "Hello world";
    console.log(s.toUpperCase());
    console.log(s.toLowerCase());
    console.log(s.charAt(0));
    if (x > y) {
        console.log("greater");
    }
    else {
        console.log("lesser");
    }
    var i = 1;
    while (i <= 10) {
        console.log(i);
        i++;
    }
    for (i = 1; i <= 10; i++) {
        console.log("For loop:" + i);
    }
    function hello() {
        return "hello";
    }
    demo.hello = hello;
    function add() {
        return "hello";
    }
    demo.add = add;
    function sub() {
        return "hello";
    }
    demo.sub = sub;
    function div() {
        return "hello";
    }
    demo.div = div;
})(demo = exports.demo || (exports.demo = {}));
