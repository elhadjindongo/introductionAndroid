package com.umd.umdetudiant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fatorielle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Application Factorielle");//changer le titre de l'ecran
        setContentView(R.layout.activity_fatorielle);
        Button calculer = findViewById(R.id.calculer);
        EditText saisi = findViewById(R.id.nombre);
        TextView resultat = findViewById(R.id.resultat);
        calculer.setOnClickListener( v-> {
            long nombreRecupere = Long.parseLong(saisi.getText().toString()); //Integer.parseInt() , Doyble.parseDouble()
            //tester si cest positif
            long factorielle = 1;
//            for (long i=nombreRecupere ; i > 1; i--){
//                factorielle *=i;//resultat *=1
//            }
//            for (long i=1 ; i <= nombreRecupere; i++){
//                factorielle *=i;//resultat *=1
//            }
            for(int i=1;i<= nombreRecupere; i++){
                factorielle*=i;
            }
            //afficher le resultat dans le textView
            resultat.setText(nombreRecupere+" factorielle est : "+String.valueOf(factorielle)); //convertir un lon vers un String
        });
    }
}