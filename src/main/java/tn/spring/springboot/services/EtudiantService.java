package tn.spring.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.entities.Equipe;
import tn.spring.springboot.entities.Etudiant;
import tn.spring.springboot.repositories.ContractRepository;
import tn.spring.springboot.repositories.DepartementRepository;
import tn.spring.springboot.repositories.EquipeRepository;
import tn.spring.springboot.repositories.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService{
    @Autowired
    EtudiantRepository EtudiantRepository;
    @Autowired
    DepartementRepository DepartementRepository;
    @Autowired
    ContractRepository ContractRepository;
    @Autowired
    EquipeRepository EquipeRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return null;
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return null;
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {

    }

    @Override
    public void assignEtudiantToDepartement(Integer idEtudiant, Integer idDepart) {
        Etudiant etudiant = EtudiantRepository.findById(idEtudiant).orElse(null);
        Departement departement = DepartementRepository.findById(idDepart).orElse(null);
        etudiant.setDepartements(departement);
        EtudiantRepository.save(etudiant);
    }
    @Transactional
    Etudiant AddAndAssignEtudiantToEquipeAndContract (Etudiant e, Integer idContract, Integer idEquipe)
    {
        Contrat contrat = ContractRepository.findById(idContract).orElse(null);
        Equipe equipe = EquipeRepository.findById(idEquipe).orElse(null);
        contrat.setEtudiant(e);
        e.getEquipes().add(equipe);
        return EtudiantRepository.save(e);
    }

}
