package com.guevarag.apprendrejouer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;

import com.guevarag.apprendrejouer.JoueurDAO;


public class NouveaujoueurActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouveaujoueur);

        Button Enregistrer_joueur=(Button) findViewById(R.id.enregistrer_joueur);

        final EditText motdepasse_joueur=(EditText) findViewById(R.id.motdepasse_joueur);
        final EditText pseudo_joueur=(EditText) findViewById(R.id.pseudo_joueur);
        final EditText nom_joueur=(EditText) findViewById(R.id.nom_joueur);
        final EditText prenom_joueur=(EditText) findViewById(R.id.prenom_joueur);
        //---------------------------


        final RadioGroup radioGroupe=(RadioGroup) findViewById(R.id.sexe_joueur);


        Enregistrer_joueur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomJoueur =nom_joueur.getText().toString();
                String pseudoJoueur =pseudo_joueur.getText().toString();
                String prenomJoueur =prenom_joueur.getText().toString();
                String motDePasse =prenom_joueur.getText().toString();
                int sexe=1;
                if(radioGroupe.getCheckedRadioButtonId()==R.id.fille_joueur){
                    sexe=1;
                }else{
                    sexe=2;
                }
                int code= JoueurDAO.creerJoueur(pseudoJoueur,nomJoueur,prenomJoueur,sexe,motDePasse);
                if(code==0){
                    Intent intent=new Intent(NouveaujoueurActivity.this,MenuActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
                else if(code==1){
                    //action pour dire que des champs sont vides

                }
                else if(code==2){
                    //action pour dire que un joueur à ce pseudo existe déjà

                }
                else if(code==3){
                    //action pour dire que le mot de passe est trop court

                }
                else{

                }

            }

        });



        //     ----------------    BOUTON MAIN      -------------------------
        ImageButton bouton_main=(ImageButton) findViewById(R.id.menu_principal_nouveaujoueur);


        bouton_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NouveaujoueurActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
//     ----------------------------------------------------------------




    }
}
