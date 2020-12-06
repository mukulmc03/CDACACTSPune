$(document).ready(function() {
    
    var fnWatermark = "First Name";
    var lnWatermark = "Last Name";

    //init, set watermark text and class
    $("#firstName").val(fnWatermark).addClass("watermark");
    $("#lastName").val(lnWatermark).addClass("watermark");
    
    //if blur and no value inside, set watermark text and class again.
    $("#firstName").blur(function(){
        if ($(this).val().length == 0){
            $(this).val(fnWatermark).addClass("watermark");
        }
    });

    $("#lastName").blur(function(){
        if ($(this).val().length == 0){
            $(this).val(lnWatermark).addClass("watermark");
        }
    });

    //if focus and text is watermrk, set it to empty and remove the watermark class
    $("#firstName").focus(function(){
        if ($(this).val() == fnWatermark){
            $(this).val('').removeClass("watermark");
        }
     });
    
    $("#lastName").focus(function(){
        if ($(this).val() == lnWatermark){
            $(this).val('').removeClass("watermark");
        }
    });
});