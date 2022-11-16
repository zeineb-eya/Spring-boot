package tn.spring.springboot.services;

import tn.spring.springboot.entities.Departement;

import java.util.List;

public interface IDepartementService {
    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);
    void removeDepartement(Integer idDepartement);
}
