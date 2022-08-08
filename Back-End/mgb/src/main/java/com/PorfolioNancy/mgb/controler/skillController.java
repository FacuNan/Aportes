/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PorfolioNancy.mgb.controler;

import com.PorfolioNancy.mgb.Entity.Skills;
import com.PorfolioNancy.mgb.Service.skillsService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
@RequestMapping("/skills")
public class skillController {
     private final skillsService skillsService;
        public skillController(skillsService skillsService){
            this.skillsService=skillsService;
        }
        @GetMapping("/all")
        public ResponseEntity<List<Skills>> obtenerSkills(){
List<Skills>Skills=skillsService.buscarSkills();
return new ResponseEntity <> (Skills, HttpStatus.OK);
        }
        @PutMapping("/update")
        public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills ){
            Skills updateSkills=skillsService.editSkills(skills);
            return new ResponseEntity<>(updateSkills, HttpStatus.OK);
        } 
       
        @PostMapping("/add")
        public ResponseEntity<Skills>crearSkills (@RequestBody Skills skills){
       Skills nuevoSkills=skillsService.addSkills(skills);
       return new ResponseEntity <> (nuevoSkills, HttpStatus.CREATED);
        }

    /**
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
        public ResponseEntity<?>deleteSkills(@PathVariable("id") Long id){
        return new ResponseEntity<>(HttpStatus.OK);
        }
        }
                

    

