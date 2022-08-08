/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PorfolioNancy.mgb.Service;

import com.PorfolioNancy.mgb.Entity.Educacion;
import com.PorfolioNancy.mgb.Repository.educacionRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class educacionService {
    private final educacionRepo educacionRepo;
    @Autowired
     public educacionService (educacionRepo educacionRepo){
         this.educacionRepo=educacionRepo;
          }
         public Educacion addEducacion (Educacion educacion){
             return educacionRepo.save(educacion); 
        
     }
         public List<Educacion> buscarEducacion(){
             return educacionRepo.findAll();
         }
         public Educacion editaeEducacion (Educacion educacion){
             return educacionRepo.save(educacion);
         }
         public void buscarEducacion(Long id){
    educacionRepo.deleteById(id);
}
     } 
