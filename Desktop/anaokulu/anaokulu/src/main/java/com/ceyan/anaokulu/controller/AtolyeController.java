/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyan.anaokulu.controller;

import com.ceyan.anaokulu.entity.Atolye;
import com.ceyan.anaokulu.repository.AtolyeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author ZEHRA
 */
@Controller
public class AtolyeController {

    @Autowired
    private AtolyeRepository atolyeRepository;

    @GetMapping("/atolye/{adi}")
    public String getir(@PathVariable String adi, Model model){

        Atolye atolye = atolyeRepository.findByAtolyeAdi(adi);

        model.addAttribute("atolye", atolye);

        return "atolye"; 
    }
}

