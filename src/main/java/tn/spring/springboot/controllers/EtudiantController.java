package tn.spring.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.entities.Etudiant;
import tn.spring.springboot.services.IEtudiantService;

import java.util.List;
@RestController
@RequestMapping("/Etudiant")
public class EtudiantController {
    @Autowired
    IEtudiantService EtudiantService;
    // http://localhost:8081/SpringMVC/Contract/retrieve-all-Etudiant
    @GetMapping("/retrieve-all-Etudiants , method = RequestMethod.GET")
    @ResponseBody
    public List<Etudiant> getEtudiant() {
        List<Etudiant> listEtudiants = EtudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }
    // http://localhost:8089/SpringMVC/Etudiant/retrieve-Etudiant/8
    @GetMapping("/retrieve-Etudiant/{IdEtudiant}")
    @ResponseBody
    public Etudiant retrieveDepartement(@PathVariable("IdEtudiant") int IdEtudiant) {
        return EtudiantService.retrieveEtudiant(IdEtudiant);
    }
    // http://localhost:8089/SpringMVC/Etudiant/add-Etudiant
    @PostMapping("/add-Etudiant")
    @ResponseBody
    public Etudiant addEtudiant(@RequestBody Etudiant e)
    {
        Etudiant addEtudiant = EtudiantService.addEtudiant(e);
        return e;
    }
    // http://localhost:8089/SpringMVC/Etudiant/remove-Etudiant/{Etudiant-id}
    @DeleteMapping("/remove-Etudiant/{IdEtudiant}")
    @ResponseBody
    public void removeEtudiant(@PathVariable("IdEtudiant") int IdEtudiant) {
        EtudiantService.removeEtudiant(IdEtudiant);
    }

    // http://localhost:8081/SpringMVC/Etudiant//modify-Etudiant
    @PutMapping("/modify-Etudiant")
    @ResponseBody
    public Etudiant modifyEtudiant(@RequestBody Etudiant Etudiant) {
        return EtudiantService.updateEtudiant(Etudiant);
    }

    @GetMapping("/assignEtudiantToDepartement/{IdEtudiant}/{idDepart}")
    void assignEtudiantToDepartement(@PathVariable Integer IdEtudiant, @PathVariable Integer idDepart)
    {
        EtudiantService.assignEtudiantToDepartement(IdEtudiant,idDepart);

    }
    @GetMapping("/AddAndAssignEtudiantToEquipeAndContract/{idContract}/{idEquipe}")
    Etudiant AddAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e,@PathVariable Integer idContract,@PathVariable Integer idEquipe)
    {
        return EtudiantService.addEtudiant(e);
    }
}
