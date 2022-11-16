package tn.spring.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.entities.Equipe;
import tn.spring.springboot.repositories.EquipeRepository;

import java.util.List;

@Service
public class EquipeService implements IEquipeService{
    @Autowired
    EquipeRepository EquipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return null;
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return null;
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return null;
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return null;
    }
}
