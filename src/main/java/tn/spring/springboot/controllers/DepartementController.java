package tn.spring.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.entities.Departement;
import tn.spring.springboot.services.IDepartementService;
import java.util.List;
@RestController
@RequestMapping("/Departement")
public class DepartementController {
    @Autowired
    IDepartementService DepartementService;
    // http://localhost:8081/SpringMVC/Contract/retrieve-all-contracts
    @GetMapping("/retrieve-all-departements")
    @ResponseBody
    public List<Departement> getDepartment() {
        List<Departement> listDepartements = DepartementService.retrieveAllDepartements();
        return listDepartements;
    }
    // http://localhost:8089/SpringMVC/operateur/retrieve-operateur/8
    @GetMapping("/retrieve-Departement/{IdDepartment}")
    @ResponseBody
    public Departement retrieveDepartement(@PathVariable("IdDepartment") int IdDepartment) {
        return DepartementService.retrieveDepartement(IdDepartment);
    }
    // http://localhost:8089/SpringMVC/operateur/add-operateur
    @PostMapping("/add-Departement")
    @ResponseBody
    public Departement addDepartement(@RequestBody Departement d)
    {
        Departement addDepartement = DepartementService.addDepartement(d);
        return d;
    }
    // http://localhost:8089/SpringMVC/operateur/remove-operateur/{operateur-id}
    @DeleteMapping("/remove-Departement/{IdDepartement}")
    @ResponseBody
    public void removeDepartement(@PathVariable("IdDepartement") int IdDepartement) {
        DepartementService.removeDepartement(IdDepartement);
    }

    // http://localhost:8081/SpringMVC/operateur//modify-Contract
    @PutMapping("/modify-Departement")
    @ResponseBody
    public Departement modifyDepartement(@RequestBody Departement Departement) {
        return DepartementService.updateDepartement(Departement);
    }
}
