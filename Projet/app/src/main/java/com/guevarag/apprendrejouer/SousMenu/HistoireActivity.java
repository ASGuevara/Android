package com.guevarag.apprendrejouer.SousMenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.guevarag.apprendrejouer.MenuActivity;
import com.guevarag.apprendrejouer.R;

public class HistoireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_histoire);










        ImageButton bouton_menu=(ImageButton) findViewById(R.id.menu_principal_histoire);


        bouton_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HistoireActivity.this,MenuActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
