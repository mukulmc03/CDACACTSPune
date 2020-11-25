/* 
    Create a user defined local module calc.js that exposes the following functions: add(a,b), subtract(a,b),
    multiply(a,b), divide(a,b), square(a), sum(a,b,c...)
    Create a client application that invokes each of these methods
*/

var obj = require("./clientCalc");

console.log("Addition is : " + obj.cliCalcAdd);
console.log("Subtraction is : " + obj.cliCalcSub);
console.log("Multiplication is : " + obj.cliCalcMul);
console.log("Division is : " + obj.cliCalcDiv);
console.log("Square is : " + obj.cliCalcSq);
console.log("Sum is : " + obj.cliCalcSum);