
package com.PorfolioNancy.mgb.Service;

import com.PorfolioNancy.mgb.Entity.Skills;
import com.PorfolioNancy.mgb.Repository.educacionRepo;
import com.PorfolioNancy.mgb.Repository.skillsRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class skillsService {
     private final skillsRepo skillsRepo;
      @Autowired
     public skillsService (skillsRepo skillsRepo){
         this.skillsRepo=skillsRepo;
          }
     public Skills addSkills(Skills skills){
             return skillsRepo.save(skills); 
        
     }
         public List<Skills> buscarSkills(){
             return skillsRepo.findAll();
         }
         public Skills editSkills(Skills skills){
             return skillsRepo.save(skills);
         }
         public void buscarSkills(Long id){
   skillsRepo.deleteById(id);
}
     } 


