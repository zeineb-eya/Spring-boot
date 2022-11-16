package tn.spring.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.Universite;
import tn.spring.springboot.repositories.DepartementRepository;
import tn.spring.springboot.repositories.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteService implements IUniversiteService{
    @Autowired
    UniversiteRepository UniversiteRepository;
    @Autowired
    DepartementRepository DepartementRepository;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return null;
    }

    @Override
    public Universite addUniversite(Universite u) {
        return null;
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return null;
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return null;
    }

    @Override
    public void assignUniversityToDepartment(Integer idUniversite, Integer idDepart) {
        Universite universite = UniversiteRepository.findById(idUniversite).orElse(null);
        Departement departement = DepartementRepository.findById(idDepart).orElse(null);
        universite.getDepartements().add(departement);
        UniversiteRepository.save(universite);
    }
}
