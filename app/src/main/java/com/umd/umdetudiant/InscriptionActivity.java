package com.umd.umdetudiant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.EditText;

public class InscriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        Button connexion = findViewById(R.id.inscription); //recuperation du bouton qui a l'id inscription
        //on detecte le clique sur le bouton
        connexion.setOnClickListener(v -> {

        //recupere le prenom
        EditText prenom = findViewById(R.id.prenom);
        String prenomRecupere = prenom.getText().toString(); //recupere ce que l'utilisateur a taper

        //recupere le nom
        EditText nom = findViewById(R.id.nom);
        String nomRecupere = nom.getText().toString(); //recupere ce que l'utilisateur a taper

        //recupere le email
        EditText email = findViewById(R.id.email);
        String emailRecupere = email.getText().toString(); //recupere ce que l'utilisateur a taper

        //recupere le telephoe
        EditText telephone = findViewById(R.id.telephone);
        int telephoneRecupere = Integer.valueOf(telephone.getText().toString()); //recupere ce que l'utilisateur a taper
            Etudiant etudiant = new Etudiant();
            etudiant.setNom(nomRecupere);
            etudiant.setPrenom(prenomRecupere);
            etudiant.setEmail(emailRecupere);
            etudiant.setTelephone(telephoneRecupere);
            System.out.println("Nom "+etudiant.getNom());
            System.out.println("Prenom "+etudiant.getPrenom());
            System.out.println("Email "+etudiant.getEmail());
            System.out.println("Telephone "+etudiant.getTelephone());
            //on vas lancer l'activite Information
            Intent launchInfo = new Intent(this, InformationActivity.class);
            launchInfo.putExtra("nomKey", etudiant.getNom());
            launchInfo.putExtra("prenomKey", etudiant.getPrenom());
            launchInfo.putExtra("emailkey", etudiant.getEmail());
            launchInfo.putExtra("telephoneKey", etudiant.getTelephone());
            startActivity(launchInfo);
        });
    }
}