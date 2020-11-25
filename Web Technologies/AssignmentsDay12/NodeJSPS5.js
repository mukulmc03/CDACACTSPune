/*
    Create a user defined module that deals with strings: This module will have the following functions:
     palindrome(string ) : accepts a strings and checks if it is palindrome
     upper(string) : converts given string to uppercase
     search() : Say, have an array that holds many web site names. Eg, www.google.com,
    www.msn.com, www.amazon.co.in, in.answers.yahoo.com, en.m.wikipedia.com,
    codehs.gitbooks.io, www.coderanch.com etc. Search for all sites that begin with “www” and
    display the total number of such sites. Eg for above eg, total is 4
    Create a client application that invokes each of these methods
*/
var obj = require("./userMod");

console.log(obj.pallindrome("Nitin"));
console.log("Given string in upper case is : " + obj.upper("Mukul"));
console.log("Number of sites starting with \"www\" are : " + obj.search());