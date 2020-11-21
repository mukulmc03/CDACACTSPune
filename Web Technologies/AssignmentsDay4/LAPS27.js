
function myFunction(){
                var order = {
                    orderID : document.getElementById("orderID").value,
                    custName : document.getElementById("custName").value,
                    billingDate : document.getElementById("billingDate").value,
                    shippingDate : document.getElementById("shippingDate").value,
                    orderTotal : document.getElementById("orderTotal").value 
                };

                var billdate = new Date(order.billingDate);
                var shipdate = new Date(order.shippingDate);
                
                console.log(order.orderID);
                if(order.custName.length >= 6 && billdate.getTime() <= shipdate.getTime()){
                    localStorage.setItem("orderList", JSON.stringify(order))
                    window.open("LAPS27a.html");
                }
            }       