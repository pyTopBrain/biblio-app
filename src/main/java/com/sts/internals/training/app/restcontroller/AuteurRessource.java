package com.sts.internals.training.app.restcontroller;

import com.sts.internals.training.app.model.Auteur;
import com.sts.internals.training.app.repository.AuteurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auteur")
public class AuteurRessource {
    @Autowired
    private AuteurRepo repo;

    @PostMapping
    public Auteur saveAuthor(@RequestBody Auteur auteur){
        return repo.save(auteur);
    }
    @GetMapping
    public java.util.List<Auteur> getAllAuthors(){
        return repo.findAll();
    }
}
