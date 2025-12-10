package com.ceyan.anaokulu.controller;

import com.ceyan.anaokulu.entity.Mesaj;
import com.ceyan.anaokulu.repository.MesajRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminMesajController {

    @Autowired
    private MesajRepository mesajRepository;

    @GetMapping("/admin/mesajlar")
    public String mesajlar(Model model) {
        List<Mesaj> mesajlar = mesajRepository.findAll(); 
        model.addAttribute("mesajlar", mesajlar);
        return "admin_mesaj"; 
    }
}



