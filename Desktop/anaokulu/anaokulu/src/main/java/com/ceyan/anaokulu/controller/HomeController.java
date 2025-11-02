/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyan.anaokulu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ZEHRA
 */
@Controller
public class HomeController {
     @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/on-kayit")
public String onKayit() {
    return "on_kayit";
}


}
