
 
package com.PorfolioNancy.mgb.Interfaces;

import com.PorfolioNancy.mgb.Entity.Usuario;
import java.util.List;

public interface IUsuario {
    public List<Usuario> getUsuario();
    
    public void saveUsuario(Usuario usuario);
    
    public void deleteUsuario(Long id);
    
    public Usuario findUsuario(Long id);
        
    }

