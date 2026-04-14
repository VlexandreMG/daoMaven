package com.mrNaina.models;

import javax.annotation.processing.Generated;

@Entity
public class Olona {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name= "nom")
    String nom;

    public Olona() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

}