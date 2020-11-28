// Write a browser based app that receives welcome.html each time a request is sent.

var http = require("http");
var fs = require("fs");

http.createServer(function(req, res){
    if(req.url ==   "/welcome"){
        fs.readFile("welcome.html", function(err, data){
            if(err){
                res.writeHead(404);
                res.end("Page you are looking for is not found");
            }
            else{
                res.writeHead(200, {"Content-Type":"text/html"});
                res.write(data);
            }
            res.end();
        });
    }
    else{
        res.writeHead(200, {"Content-Type":"text/html"});
        res.end("Please, type '/welcome' at the end of the url");
    }
}).listen(5050);
console.log('Server Started listening on 5050');