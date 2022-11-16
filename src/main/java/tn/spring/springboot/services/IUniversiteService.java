package tn.spring.springboot.services;

import tn.spring.springboot.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();

    Universite addUniversite (Universite u);

    Universite updateUniversite (Universite u);

    Universite retrieveUniversite (Integer idUniversite);

    void assignUniversityToDepartment(Integer idUniversite, Integer idDepart);
}
