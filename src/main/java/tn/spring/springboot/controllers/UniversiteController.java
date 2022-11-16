package tn.spring.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.entities.Universite;
import tn.spring.springboot.services.IUniversiteService;


import java.util.List;

@RestController
@RequestMapping("/Universite")
public class UniversiteController {
    @Autowired
    IUniversiteService UniversiteService;
    // http://localhost:8081/SpringMVC/Contract/retrieve-all-contracts
    @GetMapping("/retrieve-all-Universitets")
    @ResponseBody
    public List<Universite> getUniversite() {
        List<Universite> listUniversites = UniversiteService.retrieveAllUniversites();
        return listUniversites;
    }
    // http://localhost:8089/SpringMVC/operateur/retrieve-operateur/8
    @GetMapping("/retrieve-Universite/{IdUniversite}")
    @ResponseBody
    public Universite retrieveUniversite(@PathVariable("IdUniversite") int IdUniversite) {
        return UniversiteService.retrieveUniversite(IdUniversite);
    }
    // http://localhost:8089/SpringMVC/operateur/add-operateur
    @PostMapping("/add-Universite")
    @ResponseBody
    public Universite addUniversite(@RequestBody Universite e)
    {
        Universite addUniversite = UniversiteService.addUniversite(e);
        return e;
    }

    // http://localhost:8081/SpringMVC/operateur//modify-Contract
    @PutMapping("/modify-Universite")
    @ResponseBody
    public Universite modifyUniversite(@RequestBody Universite Universite) {
        return UniversiteService.updateUniversite(Universite);
    }
    @PutMapping("/assignUniversityToDepartment/{IdUniversite}/{idDepart}")
    void assignUniversityToDepartment(@PathVariable Integer IdUniversite,@PathVariable Integer idDepart)
    {
        UniversiteService.assignUniversityToDepartment(IdUniversite,idDepart);
    }
}
