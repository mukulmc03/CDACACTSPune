$(document).ready(function(){
    var address = $("#address").val();  
    var city = $("#city").val();
    var state = $("#state").val();
    var zip = $("#zip").val();

    $("#billShipCheck").click(function(){
        if ($("#billShipCheck")[0].checked == true){
            $("#billAddress").val(address);
            $("#billCity").val(city)
            $("#billState").val(state);
            $("#billZip").val(zip);
            $(".billingAdd").attr("disabled", "disabled");
        }
        else{
            $(".billingAdd").removeAttr("disabled", "disable");
            $(".billingAdd").val("");
        } 
    });
});