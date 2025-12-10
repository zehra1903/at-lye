/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyan.anaokulu.controller;

import com.ceyan.anaokulu.repository.OnKayitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ZEHRA
 */
@Controller
public class AdminOnKayitController {
    @Autowired
    private OnKayitRepository onKayitRepository;

    @GetMapping("/admin/onkayit")
    public String liste(Model model) {
        model.addAttribute("onkayitlar", onKayitRepository.findAll());
        return "admin_onkayit"; 
    }
    
}
