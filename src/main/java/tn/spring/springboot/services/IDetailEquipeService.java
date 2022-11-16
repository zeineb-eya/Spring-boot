package tn.spring.springboot.services;

import tn.spring.springboot.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {
    List<DetailEquipe> retrieveDetailEquipe();

    DetailEquipe updateDetailEquipe (DetailEquipe DE);

    DetailEquipe addDetailEquipe (DetailEquipe DE);

    DetailEquipe retrieveDetailEquipe (Integer idDetailEquipe);

    void removeDetailEquipe(Integer idDetailEquipe);
}
