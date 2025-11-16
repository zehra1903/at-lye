//package com.ceyan.anaokulu;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class AnaokuluApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(AnaokuluApplication.class, args);
//	}
//
//}



package com.ceyan.anaokulu;

import com.ceyan.anaokulu.entity.OnKayit;
import com.ceyan.anaokulu.repository.OnKayitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnaokuluApplication implements CommandLineRunner {

    @Autowired
    private OnKayitRepository onKayitRepository;

    public static void main(String[] args) {
        SpringApplication.run(AnaokuluApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        OnKayit kayit = new OnKayit();
        kayit.setChildName("Deneme Çocuk");
        kayit.setParentName("Zehra");
        kayit.setPhone("5551112233");
        kayit.setAtolye("Sanat Atölyesi");

        onKayitRepository.save(kayit);
        System.out.println("✅ OnKayit başarıyla kaydedildi!");
    }
}
