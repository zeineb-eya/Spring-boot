package tn.spring.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.entities.DetailEquipe;
import tn.spring.springboot.services.IDetailEquipeService;

import java.util.List;

@RestController
@RequestMapping("/DetailEquipe")
public class DetailEquipeController {
    @Autowired
    IDetailEquipeService DetailEquipeService;
    // http://localhost:8089/SpringMVC/operateur/retrieve-operateur/8
    @GetMapping("/retrieve-DetailEquipe/{IdDetailEquipe}")
    @ResponseBody
    public DetailEquipe retrieveDetailEquipe(@PathVariable("IdDetailEquipe") int IdDetailEquipe) {
        return DetailEquipeService.retrieveDetailEquipe(IdDetailEquipe);
    }
    // http://localhost:8089/SpringMVC/operateur/add-operateur
    @PostMapping("/add-DetailEquipe")
    @ResponseBody
    public DetailEquipe addDetailEquipe(@RequestBody DetailEquipe de)
    {
        DetailEquipe addDetailEquipe = DetailEquipeService.addDetailEquipe(de);
        return de;
    }
    // http://localhost:8089/SpringMVC/operateur/remove-operateur/{operateur-id}
    @DeleteMapping("/remove-DetailEquipe/{IdDetailEquipe}")
    @ResponseBody
    public void removeDetailEquipe(@PathVariable("IdDetailEquipe") int IdDetailEquipe) {
        DetailEquipeService.removeDetailEquipe(IdDetailEquipe);
    }

    // http://localhost:8081/SpringMVC/operateur//modify-Contract
    @PutMapping("/modify-DetailEquipe")
    @ResponseBody
    public DetailEquipe modifyDetailEquipe(@RequestBody DetailEquipe DetailEquipe) {
        return DetailEquipeService.updateDetailEquipe(DetailEquipe);
    }
}
