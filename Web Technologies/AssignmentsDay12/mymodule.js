// mymodule Module

exports.factorial = function(num){
    var fact = 1;
    for(var i = 1; i <= num ; i ++ ){
        fact = i * fact;
    }
    return fact;
}

exports.myprime = function(num){
    var i, m = 0, flag = 0;
    m = num / 2;
    if(num == 0 || num == 2){
        return + num +  " is not Prime";
    }
    else{
        for(i = 2; i <= m; i ++){
            if(num % i == 0){
                return + num + " is not Prime";
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        return + num + " is a Prime Number";
    } 
}

exports.printable = function(num){
    for(var i = 1; i <= 10; i ++){
        console.log(num * i);
    }
}