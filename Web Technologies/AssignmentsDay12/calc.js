// calc Module

exports.add = function(a, b){
    var sum = a + b;
    return sum;
}

exports.subtract = function(a, b){
    var sub = a - b;
    return sub;
}

exports.multiply = function(a, b){
    var mul = a * b;
    return mul;
}

exports.divide = function(a, b){
    var div = a / b;
    return div;
}

exports.square = function(a){
    return a * a;
}

exports.sum = function(){
    totSum = 0;
    for(var i = 0; i < arguments.length; i ++){
        totSum += arguments[i];        
    }
    return totSum;
}