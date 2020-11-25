// triangle Module

exports.isEquilateral = function(side1, side2, side3){
    if(side1 == side2 && side2 == side3)
        return "Given Triangle is Equilateral";
    else
        return "Given Triangle is Not Equilateral";
}

exports.calcPerimeter = function(side1, side2, side3){
    return side1 + side2 + side3;
}