package tn.spring.springboot.services;

import tn.spring.springboot.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);

    void assignEtudiantToDepartement(Integer idEtudiant, Integer idDepart);
}
