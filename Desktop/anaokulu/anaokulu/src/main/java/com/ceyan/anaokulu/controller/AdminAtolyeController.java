package com.ceyan.anaokulu.controller;

import com.ceyan.anaokulu.entity.Atolye;
import com.ceyan.anaokulu.repository.AtolyeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminAtolyeController {

    @Autowired
    private AtolyeRepository atolyeRepository;

    @GetMapping("/admin/atolye")
    public String atolyeSayfasi(Model model) {
        model.addAttribute("atolyeler", atolyeRepository.findAll());
        return "admin_atolye"; 
    }

    @PostMapping("/admin/atolye-ekle")
    public String atolyeEkle(
            @RequestParam("ad") String ad,
            @RequestParam("yas") String yas,
            @RequestParam("sure") String sure,
            @RequestParam("dersSayisi") String dersSayisi,
            @RequestParam("sertifika") String sertifika,
            @RequestParam("dil") String dil
    ) {

        Atolye a = new Atolye();
        a.setAtolyeAdi(ad);
        a.setYas(yas);
        a.setSure(sure);
        a.setDersSayisi(dersSayisi);
        a.setSertifika(sertifika);
        a.setDil(dil);

        atolyeRepository.save(a);

        return "redirect:/admin/atolye";
    }
}


