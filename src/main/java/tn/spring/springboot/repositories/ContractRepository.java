package tn.spring.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Contrat;

@Repository
public interface ContractRepository extends JpaRepository <Contrat , Integer> {


}
