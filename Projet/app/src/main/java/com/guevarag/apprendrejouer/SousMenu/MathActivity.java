package com.guevarag.apprendrejouer.SousMenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.NumberPicker;

import com.guevarag.apprendrejouer.OperationActivity;
import com.guevarag.apprendrejouer.R;


public class MathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);


        final NumberPicker chiffre_choisi=(NumberPicker)findViewById(R.id.chiffre_choisi);
        chiffre_choisi.setMaxValue(9);
        chiffre_choisi.setMinValue(1);



        ImageButton bouton_addition=(ImageButton) findViewById(R.id.bouton_addition);
        ImageButton bouton_multiplication=(ImageButton) findViewById(R.id.bouton_multiplication);
        ImageButton bouton_division=(ImageButton) findViewById(R.id.bouton_division);
        ImageButton bouton_soustracton=(ImageButton) findViewById(R.id.bouton_soustraction);


        final Intent intent=new Intent(MathActivity.this,OperationActivity.class);


        bouton_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int chiffre =chiffre_choisi.getValue();
                intent.putExtra("chiffre", chiffre);
                intent.putExtra("operande",0);

                startActivity(intent);
            }
        });

        bouton_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int chiffre =chiffre_choisi.getValue();
                intent.putExtra("chiffre", chiffre);
                intent.putExtra("operande",1);
                startActivity(intent);
            }
        });

        bouton_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int chiffre =chiffre_choisi.getValue();
                intent.putExtra("chiffre", chiffre);
                intent.putExtra("operande",2);
                startActivity(intent);
            }
        });

        bouton_soustracton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int chiffre =chiffre_choisi.getValue();
                intent.putExtra("chiffre", chiffre);
                intent.putExtra("operande",3);
                startActivity(intent);
            }
        });
    }
}
