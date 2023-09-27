package com.example.project2614

class LoginModel {
    //variabel
    var username = ""
    var password = ""
    //method/fc
    fun loginCheck():Boolean{
        if(username.equals("erna") && password.equals("amikom")){
            return true
        }else{
            return false
        }
    }
}