package com.ceyan.anaokulu.controller;

import com.ceyan.anaokulu.entity.Mesaj;
import com.ceyan.anaokulu.repository.MesajRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IletisimController {

    @Autowired
    private MesajRepository mesajRepository;

    @GetMapping("/iletisim")
    public String iletisim() {
        return "iletisim";
    }

    @PostMapping("/iletisim-gonder")
    public String iletisimGonder(
            @RequestParam String adSoyad,
            @RequestParam String email,
            @RequestParam String mesaj
    ) {
        Mesaj m = new Mesaj();
        m.setAdSoyad(adSoyad);
        m.setEmail(email);
        m.setMesaj(mesaj);

        mesajRepository.save(m);
        return "redirect:/iletisim?gonderildi=true";
    }

}
