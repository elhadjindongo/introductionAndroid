package com.umd.umdetudiant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        //on recupere les information transmis depuis InscriptionActivity
        Bundle informaion = this.getIntent().getExtras();
        String nom = informaion.getString("nomKey");
        String prenom = informaion.getString("prenomKey");
        String email = informaion.getString("emailkey");
        int telephone = informaion.getInt("telephoneKey");
        //afficher les informations recuperees
        TextView nomTextView = findViewById(R.id.infoNom);
        nomTextView.setText(nom);
        TextView prenomTextView = findViewById(R.id.infoPrenom);
        prenomTextView.setText(prenom);
        TextView emailTextView = findViewById(R.id.infoEmail);
        System.out.println("---------------"+email);
        emailTextView.setText(email);
        TextView telephoneTextView = findViewById(R.id.infotelephone);
        telephoneTextView.setText(String.valueOf(telephone));
    }
}