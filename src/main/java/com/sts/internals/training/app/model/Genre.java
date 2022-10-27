package com.sts.internals.training.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genre_litteraire")
public class Genre {
    @Id
    @Column(name = "idGenre")
    private Integer id;
    private String nomLitteraire;

    public Genre() {
    }

    public Genre(Integer id, String nomLitteraire) {
        this.id = id;
        this.nomLitteraire = nomLitteraire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomLitteraire() {
        return nomLitteraire;
    }

    public void setNomLitteraire(String nomLitteraire) {
        this.nomLitteraire = nomLitteraire;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", nomLitteraire='" + nomLitteraire + '\'' +
                '}';
    }
}
