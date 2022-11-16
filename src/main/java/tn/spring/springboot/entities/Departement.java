package tn.spring.springboot.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idDepart;
    String nomDepart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="Departements")
    private Set<Etudiant> Etudiants;
}
