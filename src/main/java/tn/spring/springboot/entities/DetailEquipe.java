package tn.spring.springboot.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idDetailEquipe;
    Integer salle;
    String thematique;
    @OneToOne(mappedBy="DetailEquipe")
    private Equipe Equipe;
}
