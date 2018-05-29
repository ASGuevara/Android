package com.guevarag.apprendrejouer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.guevarag.apprendrejouer.SousMenu.MathActivity;
import com.guevarag.apprendrejouer.SousMenu.ResultatActivity;

import java.util.ArrayList;

public class OperationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);

        int chiffre_choisit=getIntent().getIntExtra("chiffre",-1);
        int intOperande=getIntent().getIntExtra("operande",-1);
        final ArrayList<Integer> tabResult= afficherOperation(chiffre_choisit, intOperande);

        Button valider=(Button) findViewById(R.id.valider_operation);

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView faux_operation=(TextView) findViewById(R.id.faux_operation);
                TextView bravo_operation=(TextView) findViewById(R.id.bravo_operation);
                int nombreErreur=0;

                EditText result1=(EditText) findViewById(R.id.resultat1);
                EditText result2=(EditText) findViewById(R.id.resultat2);
                EditText result3=(EditText) findViewById(R.id.resultat3);
                EditText result4=(EditText) findViewById(R.id.resultat4);
//                String r1=(String) result1.getText().toString();



                if(!result1.getText().toString().equals(tabResult.get(0).toString())){
                    nombreErreur++;

                }
                if(!result2.getText().toString().equals(tabResult.get(1).toString())){
                    nombreErreur++;
                }
                if(!result3.getText().toString().equals(tabResult.get(2).toString())){
                    nombreErreur++;
                }
                if(!result4.getText().toString().equals(tabResult.get(3).toString())){
                    nombreErreur++;

                }

                if(nombreErreur==0){
                    bravo_operation.setVisibility(View.VISIBLE);
                    faux_operation.setVisibility(View.INVISIBLE);
                }
                else{

                    faux_operation.setText("Mince ! Tu as "+nombreErreur+" fautes. Essaye encore.");
                    faux_operation.setVisibility(View.VISIBLE);
                    bravo_operation.setVisibility(View.INVISIBLE);
                }

            }
        });

        Button suivant=(Button) findViewById(R.id.suivant_operation);

        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OperationActivity.this,MathActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });



        ImageButton menu=(ImageButton) findViewById(R.id.menu_principal_operation);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OperationActivity.this,MenuActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });




    }


    public int chiffreRandom(int a,int b,int c){
        int random=(int)( Math.random()*( 10 - 1 + 1 ) ) + 1;;
        while (random==a||random==b||random==c){
            random=(int)( Math.random()*( 10 - 1 + 1 ) ) + 1;;
        }
        return random;

    }

    //retourne un tableau contenant les résultats dans l'ordre
    public ArrayList<Integer> afficherOperation(int chiffre_choisit, int intOperande){
        ArrayList<Integer> tabResult=new ArrayList<Integer>();
        String operande;

        int x,y,z,t;
        x=chiffreRandom(-1,-1,-1);
        y=chiffreRandom(x,-1,-1);
        z=chiffreRandom(x,y,-1);
        t=chiffreRandom(x,y,z);

        switch(intOperande){
            case 0:
                operande=" + ";
                tabResult.add(x+chiffre_choisit);
                tabResult.add(y+chiffre_choisit);
                tabResult.add(z+chiffre_choisit);
                tabResult.add(t+chiffre_choisit);
                break;
            case 1:
                operande=" x ";
                tabResult.add(x*chiffre_choisit);
                tabResult.add(y*chiffre_choisit);
                tabResult.add(z*chiffre_choisit);
                tabResult.add(t*chiffre_choisit);
                break;
            case 2:
                operande=" / ";
                tabResult.add(chiffre_choisit/x);
                tabResult.add(chiffre_choisit/y);
                tabResult.add(chiffre_choisit/z);
                tabResult.add(chiffre_choisit/t);
                break;
            case 3:
                operande=" - ";
                tabResult.add(chiffre_choisit-x);
                tabResult.add(chiffre_choisit-y);
                tabResult.add(chiffre_choisit-z);
                tabResult.add(chiffre_choisit-t);
                break;
            default:
                operande="  ";
                break;
        }

        TextView operation1=(TextView) findViewById(R.id.operation1);
        TextView operation2=(TextView) findViewById(R.id.operation2);
        TextView operation3=(TextView) findViewById(R.id.operation3);
        TextView operation4=(TextView) findViewById(R.id.operation4);



        operation1.setText(chiffre_choisit+operande+x+" = ");
        operation2.setText(chiffre_choisit+operande+y+" = ");
        operation3.setText(chiffre_choisit+operande+z+" = ");
        operation4.setText(chiffre_choisit+operande+t+" = ");


        return tabResult;
    }
}
