/*
    File handling: Assume I have a file emp.txt that contains employee data in fixed record size the
    following format:
    1001    :   Harry   :   Sales   :   23000
    1002    :   Sarita  :   Accounts    :   20000
    1003    :   Monika  :   TechSupport :   35000
    Read the file. Display sum of salary of all employees
*/
var fs = require("fs");
console.log("Going to read file!");

let totalSalary = 0;
fs.readFile('emp.txt', function(err, data){
    if(err){
        return console.error(err);
    }
    const dataRows = data.toString().split("\n");
    for (let index=0;  index < dataRows.length; index++){
      if (index > 0){
        let empData = dataRows[index].split(":");
        totalSalary += parseInt(empData[3]);
      }
    }

    console.log("Total salary of Employees is : " + totalSalary);

    console.log("read Successfully");
});