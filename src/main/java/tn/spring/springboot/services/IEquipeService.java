package tn.spring.springboot.services;

import tn.spring.springboot.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);
}
