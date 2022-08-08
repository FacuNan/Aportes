
package com.PorfolioNancy.mgb.Service;

import com.PorfolioNancy.mgb.Entity.Usuario;
import com.PorfolioNancy.mgb.Interfaces.IUsuario;
import com.PorfolioNancy.mgb.Repository.usuarioRepo;
import exeption.UserNotFoundExeption;


import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class usuarioService implements IUsuario{
    private final usuarioRepo usuarioRepo;
    
    @Autowired
    public usuarioService(usuarioRepo usuarioRepo){
        this.usuarioRepo = usuarioRepo;
}
public Usuario addUsuario (Usuario usuario){
             return usuarioRepo.save(usuario);
        
     }
         public List<Usuario>buscarUsuario(){
             return usuarioRepo.findAll();
         }
         public Usuario editUsuario (Usuario usuario){
             return usuarioRepo.save(usuario);
         }
         public void borrarUsuario(Long id){
    usuarioRepo.deleteById(id);
}

    public Usuario obtenerUsuarioPorId(Long id) {
       return usuarioRepo.findById(id).orElseThrow(()->new UserNotFoundExeption("usuario no encontrado"));
    }
   
    

    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> usuario = usuarioRepo.findAll();
        return usuario;
       
    }

    @Override
    public void saveUsuario(Usuario usuario) {
       usuarioRepo.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
       usuarioRepo.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario usuario = usuarioRepo.findById(id).orElse(null);
       return usuario;
    
    }
     } 
