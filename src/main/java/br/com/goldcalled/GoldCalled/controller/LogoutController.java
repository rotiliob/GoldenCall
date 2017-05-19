package br.com.goldcalled.GoldCalled.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

    @Autowired
    LoginController loginController;

    @RequestMapping("logout")
    public String logout(){
        return loginController.loginForm();
    }
}
