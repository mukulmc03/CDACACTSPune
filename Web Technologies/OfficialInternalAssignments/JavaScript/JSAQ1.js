
function myFun1(){
    var email = document.getElementById("email").value;
    var confirmEmail = document.getElementById("confirmEmail").value;
    if(email != confirmEmail){
        alert("Email IDs do not match");
    }
    else{
        myFun2();
        alert("All data entered correctly");
    }
}

function myFun2(){
    var selectedStand = document.getElementById("stand").value;
    floorValue = document.getElementById("floor").value;

    if(selectedStand == "platinumGallery"){
        document.getElementById("costOfTicket").value = 25000;
        document.getElementById("floor").setAttribute("disabled", "disabled");
    }
    else if(selectedStand == "superHospitalityStand"){
        document.getElementById("costOfTicket").value = 20000;
        document.getElementById("floor").setAttribute("disabled", "disabled");
    }
    else if(selectedStand = "northWestStand"){
        document.getElementById("floor").removeAttribute("disabled");
        if(floorValue == "firstFloor"){
            document.getElementById("costOfTicket").value = 6000;
        }
        else if(floorValue == "secondFloor"){
            document.getElementById("costOfTicket").value = 2000;
        }
    }
    else if(selectedStand == "eastStand"){
        document.getElementById("floor").removeAttribute("disabled");
        if(floorValue == "firstFloor"){
            document.getElementById("costOfTicket").value = 3000;
        }
        else if(floorValue == "secondFloor"){
            document.getElementById("costOfTicket").value = 1000;
        }
    }
}