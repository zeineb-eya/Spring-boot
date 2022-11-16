package tn.spring.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.entities.Contrat;
import tn.spring.springboot.services.IContractService;

import java.util.List;

@RestController
@RequestMapping("/Contract")
public class ContractController {
    @Autowired
    IContractService ContractService;
    // http://localhost:8081/SpringMVC/Contract/retrieve-all-contracts
    @GetMapping("/retrieve-all-contracts")
    @ResponseBody
    public List<Contrat> getContracts() {
        List<Contrat> listContrats = ContractService.retrieveAllContrats();
        return listContrats;
    }
    // http://localhost:8089/SpringMVC/Contract/retrieve-Contract/8
    @GetMapping("/retrieve-contract/{IdContrat}")
    @ResponseBody
    public Contrat retrieveContract(@PathVariable("IdContrat") int IdContrat) {
            return ContractService.retrieveContrat(IdContrat);
}
// http://localhost:8089/SpringMVC/Contract/add-Contract
    @PostMapping("/add-Contract")
    @ResponseBody
    public Contrat addContract(@RequestBody Contrat c)
    {
        Contrat addContract = ContractService.addContrat(c);
        return c;
    }
    // http://localhost:8089/SpringMVC/Contract/remove-Contract/{Contract-id}
    @DeleteMapping("/remove-Contrat/{IdContrat}")
    @ResponseBody
    public void removeContract(@PathVariable("IdContrat") int IdContrat) {
        ContractService.removeContrat(IdContrat);
    }

// http://localhost:8081/SpringMVC/Contract//modify-Contract
    @PutMapping("/modify-Contract")
    @ResponseBody
    public Contrat modifyContract(@RequestBody Contrat Contract) {
        return ContractService.updateContrat(Contract);
    }
}
