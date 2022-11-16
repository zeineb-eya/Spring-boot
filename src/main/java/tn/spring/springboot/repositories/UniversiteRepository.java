package tn.spring.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Universite;

import java.util.List;
import java.util.Optional;

@Repository
public interface UniversiteRepository extends JpaRepository <Universite , Integer> {

}
