package com.guevarag.apprendrejouer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class NouveaujoueurActivity extends AppCompatActivity {

    public static final String NOM_JOUEUR="nom_joueur";
    public static final String PRENOM_JOUEUR="prenom_joueur";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouveaujoueur);

        Button Enregistrer_joueur=(Button) findViewById(R.id.enregistrer_joueur);
        EditText nom_joueur=(EditText) findViewById(R.id.nom_joueur);
        EditText prenom_joueur=(EditText) findViewById(R.id.prenom_joueur);
        final String nomJoueur =nom_joueur.getText().toString();
        final String prenomJoueur =prenom_joueur.getText().toString();

        Enregistrer_joueur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NouveaujoueurActivity.this,IdentificationActivity.class);
//                intent.putExtra(NOM_JOUEUR,nomJoueur);
//                intent.putExtra(PRENOM_JOUEUR,prenomJoueur);
                startActivity(intent);
            }

        });

        View.OnClickListener action_jouer=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NouveaujoueurActivity.this,MenuActivity.class);
//                intent.putExtra(NOM_JOUEUR,nomJoueur);
//                intent.putExtra(PRENOM_JOUEUR,prenomJoueur);
                startActivity(intent);
            }
        };





    }
}
