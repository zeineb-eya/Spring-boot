package tn.spring.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.entities.Departement;

import java.util.List;

@Repository
public interface DepartementRepository extends JpaRepository <Departement, Integer> {


}
