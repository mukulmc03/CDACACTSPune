/*
    Create 3 user defined modules that deal with shapes: circle.js, rectangle.js, triangle.js
     Circle.js has functions like : calcArea(radius), calcCircumference(radius), calcDiameter(radius)
     Rectangle.js – calcArea(length, breadth), calcPerimeter(length, breadth)
     Triangle.js – isEquilateral(side1, side2, side3), calcPerimeter()
    Make use of Math predefined core object. Create a client application that invokes each of these methods
*/

var obj = require("./clientApp4.js");

console.log("Area of Circle is : " + obj.areaOfCir);
console.log("Circumference of Circle is : " + obj.circumferenceOfCir);
console.log("Diameter of Circle is : " + obj.diameterOfCir);

console.log("Area of Rectangle is : " + obj.areaOfRec);
console.log("Perimeter of Rectangle is : " + obj.perimeterOfRec);

console.log(obj.equiTri);
console.log("Perimeter of Triangle is : " + obj.perimeterOfTri);