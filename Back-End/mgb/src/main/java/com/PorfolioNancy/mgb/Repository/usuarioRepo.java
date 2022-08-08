
package com.PorfolioNancy.mgb.Repository;

import com.PorfolioNancy.mgb.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface usuarioRepo extends JpaRepository<Usuario, Long> {
    
}
