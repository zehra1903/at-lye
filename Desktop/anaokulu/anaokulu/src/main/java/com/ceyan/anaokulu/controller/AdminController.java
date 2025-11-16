///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.ceyan.anaokulu.controller;
//
//import ch.qos.logback.core.model.Model;
//import com.ceyan.anaokulu.entity.Duyuru;
//import com.ceyan.anaokulu.repository.DuyuruRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
///**
// *
// * @author ZEHRA
// */
//@Controller
//public class AdminController {
//    @Autowired
//    private DuyuruRepository duyuruRepository;
//
//    @PostMapping("/admin/duyuru-ekle")
//    public String duyuruEkle(Duyuru duyuru) {
//        duyuruRepository.save(duyuru);
//        return "redirect:/admin/duyurular";
//    }
//
//    @GetMapping("/admin/duyurular")
//    public String adminDuyuruListesi(Model model) {
//        model.addAttribute("duyurular", duyuruRepository.findAll());
//        return "admin_duyurular";  // admin panel sayfası
//    }
//}
