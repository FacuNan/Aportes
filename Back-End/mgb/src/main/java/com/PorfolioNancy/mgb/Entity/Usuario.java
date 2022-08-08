
package com.PorfolioNancy.mgb.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    
    private Long id;
    @NotNull
    private String nombre ;
     @NotNull
    private String apellido;
      @NotNull
    private String titulo;
       @NotNull
    private String descripcion;
        @NotNull
    private String fotoPerfil;

    
        
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
private List<Educacion>educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkills")
private List<Skills> skillsList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
private List<Experiencia> experienciaList;
    
}







