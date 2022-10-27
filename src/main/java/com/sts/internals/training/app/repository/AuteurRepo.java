package com.sts.internals.training.app.repository;

import com.sts.internals.training.app.model.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepo extends JpaRepository<Auteur,Integer> {
}
