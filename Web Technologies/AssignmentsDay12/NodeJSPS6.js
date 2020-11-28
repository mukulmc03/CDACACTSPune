/*
    File handling: Create an array of names. Read the contents of array and save into a file – names.txt
*/

var fs = require("fs");
var array = ["Mukul", "Rahul", "Bhushan"];
function myFun(){
    for(var i = 0; i < array.length; i ++){
        fs.appendFile("names.txt"," "+ array[i], function(err){
            if (err) throw err;
            return true;
        });  
    }
}

if(myFun){
    console.log("Saved!");
}