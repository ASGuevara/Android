package com.guevarag.apprendrejouer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;

import com.guevarag.apprendrejouer.JoueurDAO;

import com.guevarag.apprendrejouer.SousMenu.MathActivity;

import java.util.ArrayList;
import java.util.List;

public class IdentificationActivity extends AppCompatActivity {

    private static int nb_joueurs;
    private ArrayList<Joueur> liste_joueurs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);

        int nombreJoueur=JoueurDAO.compterJoueurs();
        List<Joueur> listeJoueur=JoueurDAO.trouverTousLesJoueurs();
        TableLayout tablelayout=(TableLayout)findViewById(R.id.liste_joueurs);
        int i=0;
//        for(Joueur ji : listeJoueur){
//            i++;
//            String pseudo=ji.getPseudo();
//            Button newButton=new Button(this);
//            newButton.setText(pseudo);
//            newButton.setId(i);
//            newButton.setWidth(100);
//            tablelayout.addView(newButton);
//
//        }


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



        //     ----------------    BOUTON Main      -------------------------
        ImageButton bouton_main=(ImageButton) findViewById(R.id.menu_principal_identification);


        bouton_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IdentificationActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
//     ----------------------------------------------------------------




    }
}
