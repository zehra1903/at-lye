package com.ceyan.anaokulu.controller;

import com.ceyan.anaokulu.entity.Duyuru;
import com.ceyan.anaokulu.repository.DuyuruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;             // <--- DOĞRU import burası
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AdminController {

    @Autowired
    private DuyuruRepository duyuruRepository;

    @PostMapping("/admin/duyuru-ekle")
    public String duyuruEkle(Duyuru duyuru, RedirectAttributes redirectAttributes) {
        duyuruRepository.save(duyuru);

        redirectAttributes.addFlashAttribute("successMessage", "Duyuru başarılı bir şekilde oluşturuldu!");

        return "redirect:/admin/duyurular";
    }

    @GetMapping("/admin")
    public String adminRedirect() {
        return "redirect:/admin/login";
    }

}
