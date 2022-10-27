package com.sts.internals.training.app.restcontroller;

import com.sts.internals.training.app.model.Livre;
import com.sts.internals.training.app.repository.LivreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livre")
public class LivreRessource {

    @Autowired
    private LivreRepo repository;

    @GetMapping
    public List<Livre>  getAllBooks(){
        return repository.findAll();
    }

    @PostMapping
    public Livre savelivre(@RequestBody Livre livre){
        return repository.save(livre);
    }
    @DeleteMapping
    public void deleteBook(@RequestBody  Livre livre){
        repository.delete(livre);
    }
}
