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
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEquipe;
    String nomEquipe;
    @Enumerated(EnumType.STRING)
    Niveau Niveau;
    @ManyToMany(mappedBy="Equipes", cascade = CascadeType.ALL)
    private Set<Etudiant> Etudiants;
    @OneToOne
    private DetailEquipe DetailEquipe;
}
