package tn.spring.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.repositories.ContractRepository;

import java.util.List;

@Service
public class ContactService implements IContractService {
    @Autowired
    ContractRepository Contractrepository;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return null;
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return null;
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return null;
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return null;
    }

    @Override
    public void removeContrat(Integer idContrat) {

    }
}
