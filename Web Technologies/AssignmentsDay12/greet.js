// greet Module

exports.greet = function(){
    var date = new Date();
    var hours = date.getHours();
    if(hours < 12){
        return "Good Morning";
    }
    else if(hours < 18){
        return "Good Afternoon";
    }
    else{
        return "Good Evening";
    }
}