package com.guevarag.apprendrejouer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class IdentificationActivity extends AppCompatActivity {

    private static int nb_joueurs;
    private ArrayList<Joueur> liste_joueurs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);

        Button nouveau_joueur = (Button) findViewById(R.id.nouveau_joueur);

        nouveau_joueur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IdentificationActivity.this,NouveaujoueurActivity.class);
                startActivity(intent);
            }

        });

//        String prenom_joueur=getIntent().getStringExtra(NouveaujoueurActivity.PRENOM_JOUEUR);
//        String nom_joueur=getIntent().getStringExtra(NouveaujoueurActivity.NOM_JOUEUR);
//        Joueur joueur=new Joueur(nom_joueur,prenom_joueur);
//        nb_joueurs++;
//        liste_joueurs.add(nb_joueurs,joueur);







    }
}
