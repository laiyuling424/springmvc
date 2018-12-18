package com.cenyol.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class Controller01 {
    @RequestMapping("/findUser")
    @ResponseBody
    public String findUser(){
        User user=new User("dabaicai","lll");
        return user.toString();
    }

    public class User {
        String name;
        String pwd;
        public User(){

        }
        public User(String name,String pwd){
            this.name=name;
            this.pwd=pwd;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", pwd='" + pwd + '\'' +
                    '}';
        }
    }
}
