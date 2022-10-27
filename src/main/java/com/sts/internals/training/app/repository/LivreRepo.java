package com.sts.internals.training.app.repository;


import com.sts.internals.training.app.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LivreRepo extends JpaRepository<Livre,Integer> {

}
