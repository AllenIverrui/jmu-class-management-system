


var loginUrl='http://localhost:8080/JUMManger/login.html';

console.log(localStorage.getItem('username'));
//如果访问登陆页面之外的页面并且还没有登陆成功之后写入cookie的token就转到登陆页面
//给页面显示登陆用户名
var username =localStorage.getItem('username');
var userid=localStorage.getItem('userid');
console.log(userid+'用户id');
$('.login_name').html(username);
console.log(username+'123');
if(username==undefined){
    if(window.location!=loginUrl) {
        window.top.location = loginUrl;
    }
}




