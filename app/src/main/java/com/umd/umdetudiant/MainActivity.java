package com.umd.umdetudiant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button connexion = findViewById(R.id.connexion); //recuperation du bouton qui a ''id connexion
        //on detecte le clique sur le bouton
        connexion.setOnClickListener(v -> {
            //on vas lancer l'activite Inscription
            startActivity(new Intent(this, InscriptionActivity.class));
        });
    }
}