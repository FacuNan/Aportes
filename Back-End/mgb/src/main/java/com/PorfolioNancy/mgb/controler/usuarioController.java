
package com.PorfolioNancy.mgb.controler;


import com.PorfolioNancy.mgb.Entity.Usuario;
import com.PorfolioNancy.mgb.Service.usuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/usuario")

public class usuarioController {
   @Autowired
           usuarioService usuarioService;
    

    
    
    
    
        public usuarioController(usuarioService usuarioService){
            this.usuarioService=usuarioService;
        }
           @GetMapping("usuario/traer")
   public List<Usuario> getUsuario(){
    return usuarioService.getUsuario();
    }
    
    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/id/{id}")
       public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id){
           Usuario usuario=usuarioService.obtenerUsuarioPorId(id);
           return new ResponseEntity<>(usuario, HttpStatus.OK);
        }
        
    /**
     *
     * @param usuario
     * @return
     */
    @PutMapping("/update")
        public ResponseEntity<Usuario> editUsuario(@RequestBody Usuario usuario ){
            Usuario updateUsuario=usuarioService.editUsuario(usuario);
            return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
        } 
}