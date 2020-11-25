/*
    Create a module by name mymodule.js to store three functions
     factorial – to find factorial of a number.
     myprime - Check prime number
     printable – to display table of a number
*/

var obj = require("./mymodule");
console.log(obj.factorial(5));
console.log(obj.myprime(5));
console.log(obj.printable(5));