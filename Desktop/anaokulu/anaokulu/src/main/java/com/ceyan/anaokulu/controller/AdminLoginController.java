/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyan.anaokulu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ZEHRA
 */
@Controller
public class AdminLoginController {
    @GetMapping("/admin/login")
    public String loginPage() {
        return "login"; 
    }

    @PostMapping("/admin/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {

        if ("admin".equals(username) && "1234".equals(password)) {
            
            return "redirect:/admin/duyurular";
        } else {

            model.addAttribute("error", "Kullanıcı adı veya şifre yanlış!");
            return "login";
        }
    }
}
