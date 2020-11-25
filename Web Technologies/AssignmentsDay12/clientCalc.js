// client Module

var cli = require("./calc.js");

exports.cliCalcAdd = cli.add(10, 20);
exports.cliCalcSub = cli.subtract(20, 10);
exports.cliCalcMul = cli.multiply(10, 20);
exports.cliCalcDiv = cli.divide(100, 20);
exports.cliCalcSq = cli.square(10, 20);
exports.cliCalcSum = cli.sum(10, 20, 50, 90);
