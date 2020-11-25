// client Module for NodeJS PS4

var cliRec = require("./rectangle");
var cliCir = require('./circle');
var cliTri = require("./triangle");

exports.areaOfRec = cliRec.calcArea(10, 20);
exports.perimeterOfRec = cliRec.calcPerimeter(10, 20);

exports.areaOfCir = cliCir.calcArea(10);
exports.circumferenceOfCir = cliCir.calcCircumference(10);
exports.diameterOfCir = cliCir.calcDiameter(10);

exports.equiTri = cliTri.isEquilateral(10, 10, 10);
exports.perimeterOfTri = cliTri.calcPerimeter(10, 10, 10);
