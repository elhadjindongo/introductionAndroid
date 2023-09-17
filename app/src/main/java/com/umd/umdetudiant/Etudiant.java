/**
 * Created By El Hadji M. NDONGO on 9/16/2023
 * Copyright devTech - Gamma
 **/

package com.umd.umdetudiant;

public class Etudiant {
    private String nom;
    private String prenom;
    private String email;
    private int telephone;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}
