function checks(){
    var username = document.getElementById("account").value;
    var password = document.getElementById("password").value;
    var ajax = new XMLHttpRequest();
    ajax.open("post","/hello/time",true);
    ajax.onreadystatechange=function () {
        if(ajax.readyState==4&&ajax.status==200){
            var rt = ajax.responseText;
            var login = document.getElementById("login");
            login.innerHTML=rt;
        }
    }
    ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    var data="username="+username+"&password="+password;
    ajax.send(data);
}