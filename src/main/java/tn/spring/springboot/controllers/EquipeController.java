package tn.spring.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.entities.DetailEquipe;
import tn.spring.springboot.entities.Equipe;
import tn.spring.springboot.services.IEquipeService;

@RestController
@RequestMapping("/Equipe")
public class EquipeController {
    @Autowired
    IEquipeService EquipeService;
    // http://localhost:8089/SpringMVC/operateur/retrieve-operateur/8
    @GetMapping("/retrieve-Equipe/{IdEquipe}")
    @ResponseBody
    public Equipe retrieveEquipe(@PathVariable("IdEquipe") int IdEquipe) {
        return EquipeService.retrieveEquipe(IdEquipe);
    }
    // http://localhost:8089/SpringMVC/operateur/add-operateur
    @PostMapping("/add-DEquipe")
    @ResponseBody
    public Equipe addEquipe(@RequestBody Equipe e)
    {
        Equipe addEquipe = EquipeService.addEquipe(e);
        return e;
    }

    // http://localhost:8081/SpringMVC/operateur//modify-Contract
    @PutMapping("/modify-Equipe")
    @ResponseBody
    public Equipe modifyEquipe(@RequestBody Equipe Equipe) {
        return EquipeService.updateEquipe(Equipe);
    }
}
