package tn.spring.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.repositories.DepartementRepository;

import java.util.List;

@Service
public class DepartementService implements IDepartementService{
    @Autowired
    DepartementRepository DepartementRepository;


    @Override
    public List<Departement> retrieveAllDepartements() {
        return null;
    }

    @Override
    public Departement addDepartement(Departement d) {
        return null;
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return null;
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return null;
    }

    @Override
    public void removeDepartement(Integer idDepartement) {

    }

}
