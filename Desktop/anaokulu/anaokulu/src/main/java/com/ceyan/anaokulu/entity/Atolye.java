/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyan.anaokulu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author ZEHRA
 */
@Entity
public class Atolye {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String atolyeAdi;
    private String yas;
    private String sure;
    private String dersSayisi;
    private String sertifika;
    private String dil;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAtolyeAdi() {
        return atolyeAdi;
    }

    public void setAtolyeAdi(String atolyeAdi) {
        this.atolyeAdi = atolyeAdi;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }

    public String getDersSayisi() {
        return dersSayisi;
    }

    public void setDersSayisi(String dersSayisi) {
        this.dersSayisi = dersSayisi;
    }

    public String getSertifika() {
        return sertifika;
    }

    public void setSertifika(String sertifika) {
        this.sertifika = sertifika;
    }

    public String getDil() {
        return dil;
    }

    public void setDil(String dil) {
        this.dil = dil;
    }
    
    
}
