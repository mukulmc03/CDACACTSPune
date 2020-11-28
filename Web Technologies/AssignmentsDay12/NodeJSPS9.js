/*
    Write a browser based app. Everytime a http request comes in, server must send a greeting back to
    user depending on time of the day. Use the Greet.js module created earlier.
*/

var http = require("http");
var obj = require("./clientGreet");

http.createServer(function(req, res){
    res.writeHead(200, {"Content-Type":"text/html"});
    res.end(obj.clientGreet);
}).listen(5100);
console.log("Server Started listening on 5100");