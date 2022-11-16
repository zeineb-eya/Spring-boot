package tn.spring.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.entities.DetailEquipe;
import tn.spring.springboot.repositories.DetailEquipeRepository;

import java.util.List;

@Service
public class DetailEquipeService implements IDetailEquipeService {
    @Autowired
    DetailEquipeRepository DetailEquipeRepository;

    @Override
    public List<DetailEquipe> retrieveDetailEquipe() {
        return null;
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe DE) {
        return null;
    }

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe DE) {
        return null;
    }

    @Override
    public DetailEquipe retrieveDetailEquipe(Integer idDetailEquipe) {
        return null;
    }

    @Override
    public void removeDetailEquipe(Integer idDetailEquipe) {

    }
}
