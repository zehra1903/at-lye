/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyan.anaokulu.repository;

import com.ceyan.anaokulu.entity.Atolye;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ZEHRA
 */
public interface AtolyeRepository extends JpaRepository<Atolye, Long> {
    Atolye findByAtolyeAdi(String atolyeAdi);

}
 
    

