/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyan.anaokulu.controller;

import com.ceyan.anaokulu.entity.Duyuru;
import com.ceyan.anaokulu.repository.DuyuruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ZEHRA
 */
@Controller
public class DuyuruController {

    @Autowired
    private DuyuruRepository duyuruRepository;

    @GetMapping("/duyurular")
    public String duyurular(Model model) {
        model.addAttribute("duyurular", duyuruRepository.findAll());
        return "duyurular";
    }

    @PostMapping("/admin/duyuru-guncelle")
    public String duyuruGuncelle(@RequestParam Long id,
            @RequestParam String baslik,
            @RequestParam String icerik) {

        Duyuru d = duyuruRepository.findById(id).orElse(null);

        if (d != null) {
            d.setBaslik(baslik);
            d.setIcerik(icerik);
            duyuruRepository.save(d);
        }

        return "redirect:/admin/duyurular";
    }

    @GetMapping("/duyuru/{id}")
    public String duyuruDetay(@PathVariable Long id, Model model) {
        Duyuru d = duyuruRepository.findById(id).orElse(null);
        model.addAttribute("d", d);
        return "duyuru_detay";
    }

}
