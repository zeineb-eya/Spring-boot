package tn.spring.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.DetailEquipe;

@Repository
public interface DetailEquipeRepository extends JpaRepository <DetailEquipe, Integer>{
}
