/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyan.anaokulu.controller;

import com.ceyan.anaokulu.repository.DuyuruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ZEHRA
 */
@Controller
public class AdminDuyuruController {

    @Autowired
    private DuyuruRepository duyuruRepository;

    @GetMapping("/admin/duyurular")
    public String adminDuyurular(Model model) {
        model.addAttribute("duyurular", duyuruRepository.findAll());
        return "adminduyuru";
    }

    @GetMapping("/admin/duyuru-sil")
    public String duyuruSil(@RequestParam("id") Long id) {

        duyuruRepository.deleteById(id);
        return "redirect:/admin/duyurular";
    }

    @GetMapping("/admin/duyuru-duzenle")
    public String duyuruDuzenle(@RequestParam("id") Long id, Model model) {
        var duyuru = duyuruRepository.findById(id).orElse(null);
        model.addAttribute("duyuru", duyuru);
        return "adminduyuru-duzenle";
    }

}
