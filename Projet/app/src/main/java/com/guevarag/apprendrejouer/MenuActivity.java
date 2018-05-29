package com.guevarag.apprendrejouer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.guevarag.apprendrejouer.SousMenu.CultureActivity;
import com.guevarag.apprendrejouer.SousMenu.HistoireActivity;
import com.guevarag.apprendrejouer.SousMenu.MathActivity;
import com.guevarag.apprendrejouer.SousMenu.ResultatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        ImageButton bouton_maths=(ImageButton) findViewById(R.id.bouton_maths);
        ImageButton bouton_culture=(ImageButton) findViewById(R.id.bouton_culture);
        ImageButton bouton_histoire=(ImageButton) findViewById(R.id.bouton_histoire);
        ImageButton bouton_resultat=(ImageButton) findViewById(R.id.bouton_resultat);


        bouton_culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,CultureActivity.class);
                startActivity(intent);
            }
        });

        bouton_maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,MathActivity.class);
                startActivity(intent);
            }
        });

        bouton_histoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,HistoireActivity.class);
                startActivity(intent);
            }
        });

        bouton_resultat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,ResultatActivity.class);
                startActivity(intent);
            }
        });

//     ----------------    BOUTON MENU      -------------------------
        ImageButton bouton_menu=(ImageButton) findViewById(R.id.menu_principal_menu);


        bouton_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,MenuActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
//     ----------------------------------------------------------------


        //     ----------------    BOUTON DECONNEXION      -------------------------
        Button bouton_deconnexion=(Button) findViewById(R.id.bouton_deconnexion);


        bouton_deconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
//     ----------------------------------------------------------------

    }


}
