package tn.spring.springboot.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer IdContrat;
    @Temporal (TemporalType.DATE)
    Date dateDebutContrat;
    Date dateFinContrat;
    Specialite Specialite;
    Boolean archive;
    Integer montantContract;
    @ManyToOne
    Etudiant Etudiant;


}
