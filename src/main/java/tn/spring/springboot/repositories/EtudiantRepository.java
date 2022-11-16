package tn.spring.springboot.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.entities.Etudiant;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository <Etudiant, Integer>  {

    @Query(value = "SELECT * FROM etudiant e WHERE e.nomE=?1 and e.prenomE=?2",nativeQuery = true)
    Etudiant retreveEtudiantFirstNameAndLastName(String nom,String prenom);

//    Etudiant findByNomEandPrenomE(String nom,String prenom);
//    List findByDepartmentNomDepart(String nomDepart);
//    Integer countbyDepartementIdDepartement(int id);
//    List<Etudiant> findByIdEtudiant(Integer IdEtudiant, Sort sort);


}
