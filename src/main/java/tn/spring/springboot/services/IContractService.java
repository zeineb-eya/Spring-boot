package tn.spring.springboot.services;

import tn.spring.springboot.entities.Contrat;

import java.util.List;

public interface IContractService  {
    List<Contrat> retrieveAllContrats();

    Contrat updateContrat (Contrat ce);

    Contrat addContrat (Contrat ce);

    Contrat retrieveContrat (Integer idContrat);

    void removeContrat(Integer idContrat);


}
