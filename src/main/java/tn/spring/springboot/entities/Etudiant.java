package tn.spring.springboot.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEtudiant;
    String prenomE;
    String nomE;
    @Enumerated(EnumType.STRING)
    OptionE optionE;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="Etudiant")
    private Set<Contrat> Contrats;
    @ManyToOne
    Departement Departements;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe> Equipes = new HashSet<>();

}
