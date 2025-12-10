package com.ceyan.anaokulu.controller;

import com.ceyan.anaokulu.entity.Galeri;
import com.ceyan.anaokulu.repository.GaleriRepository;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class GaleriController {

    @Autowired
    private GaleriRepository galeriRepository;

    @PostMapping("/admin/galeri-ekle")
    public String galeriEkle(@RequestParam("resim") MultipartFile file,
            RedirectAttributes redirectAttributes) {

        try {
            String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();

            String uploadDir = "src/main/resources/static/";
            Path path = Paths.get(uploadDir + fileName);

            Files.write(path, file.getBytes());

            Galeri g = new Galeri();
            g.setResimYolu("/" + fileName);
            galeriRepository.save(g);

            redirectAttributes.addFlashAttribute("successMessage", "Resim başarılı bir şekilde oluşturuldu!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/admin/galeri";
    }

    @GetMapping("/admin/galeri")
    public String adminGaleri(Model model) {
        model.addAttribute("resimler", galeriRepository.findAll());
        return "admin_galeri";
    }

    @GetMapping("/galeri")
    public String galeriSayfasi(Model model) {
        model.addAttribute("resimler", galeriRepository.findAll());
        return "galeri";
    }

    @GetMapping("/admin/galeri-sil")
    public String galeriSil(@RequestParam("id") Long id) {

        galeriRepository.deleteById(id);
        return "redirect:/admin/galeri";
    }

}
