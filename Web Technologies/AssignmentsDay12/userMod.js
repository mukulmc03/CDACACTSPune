// user Module

exports.pallindrome = function(string){
    str = string.toLowerCase();
    var i = 0, j = str.length - 1;
    while(i < j){
        if(str.charAt(i) != str.charAt(j))
            return "String is Not Pallindrome";
            i ++;
            j --; 
    }
    return "String is Pallindrome";
}

exports.upper = function(string){
    return string.toUpperCase();
}

exports.search = function(){
    let arr = [
        "www.google.com",
        "www.msn.com",
        "www.amazon.co.in",
        "in.answers.yahoo.com", 
        "en.m.wikipedia.com",
        "codehs.gitbooks.io",
        "www.coderanch.com"
      ];
      let count = arr.reduce((c,i)=> {
        i.split(".")[0]==='www' && c++ ;
        return c;
      },0);
      return count; 
}