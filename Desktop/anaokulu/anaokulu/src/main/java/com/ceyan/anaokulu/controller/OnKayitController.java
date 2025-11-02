/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyan.anaokulu.controller;

import com.ceyan.anaokulu.entity.OnKayit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.ceyan.anaokulu.repository.OnKayitRepository;

/**
 *
 * @author ZEHRA
 */
@Controller
public class OnKayitController {
    
    @Autowired
    private OnKayitRepository onKayitRepository;
    
    @PostMapping("/on-kayit")
    public String kaydet(
            @RequestParam String childName,
            @RequestParam String parentName,
            @RequestParam String phone,
            @RequestParam String atolye,
            RedirectAttributes redirectAttributes
    ){
        OnKayit kayit = new OnKayit();
        kayit.setChildName(childName);
        kayit.setParentName(parentName);
        kayit.setPhone(phone);
        kayit.setAtolye(atolye);
        
        onKayitRepository.save(kayit);
        
        redirectAttributes.addFlashAttribute("success","Ön kayıt başarıyla kaydedildi!");
        return "redirect:/";
    }
    }       
