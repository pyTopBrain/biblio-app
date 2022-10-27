package com.sts.internals.training.app.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idLivre")
    private Integer id;
    private String titre;
    private LocalDate dateDePublication;
    private Long nbPages;
    @OneToOne
    @JoinColumn(name = "idAuteur")
    private Auteur auteur;
    @OneToOne
    @JoinColumn(name = "idGenre")
    private Genre genreLitteraire;

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public Livre() {
    }

    public Livre(Integer id, String titre, LocalDate dateDePublication, Long nbPages, Auteur auteur) {
        this.id = id;
        this.titre = titre;
        this.dateDePublication = dateDePublication;
        this.nbPages = nbPages;
        this.auteur = auteur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateDePublication() {
        return dateDePublication;
    }

    public void setDateDePublication(LocalDate dateDePublication) {
        this.dateDePublication = dateDePublication;
    }

    public Long getNbPages() {
        return nbPages;
    }

    public void setNbPages(Long nbPages) {
        this.nbPages = nbPages;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", dateDePublication=" + dateDePublication +
                ", nbPages=" + nbPages +
                '}';
    }
}
