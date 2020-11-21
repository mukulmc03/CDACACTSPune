/* Write a program cmi.js that accepts a distance in inches and prints the corresponding value
in cms. Note that 1 inch = 2.54 cm. Test the js file in HTML. */

var distance = prompt("Enter distance in inches");
var cms =  (1 / 2.54) * distance;
document.write("Distance in centimeters is : " + cms);