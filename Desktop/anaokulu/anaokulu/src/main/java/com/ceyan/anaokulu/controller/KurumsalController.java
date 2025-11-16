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
public class KurumsalController {
    @GetMapping("/kurumsal")
    public String kurumsal(){
        return "kurumsal";
    }
    
}
