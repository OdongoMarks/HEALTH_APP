package com.example.marks.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Diseases extends AppCompatActivity {

    Button kwasha;
    Button mars;
    Button beri;
    Button rick;
    Button goit;
    Button scur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);
        kwasha = (Button) findViewById(R.id.d1);

        kwasha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diseases.this,Kwashakor.class);
                startActivity(intent);
            }
        });
        mars = (Button) findViewById(R.id.d2);

        mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inter = new Intent(Diseases.this,marasmus.class);
                startActivity(inter);
            }
        });
        beri = (Button) findViewById(R.id.button2);

        beri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(Diseases.this,BeriBeri.class);
                startActivity(inten);
            }
        });
        rick = (Button) findViewById(R.id.button3);

        rick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rick = new Intent(Diseases.this,Ricket.class);
                startActivity(rick);
            }
        });

        goit = (Button) findViewById(R.id.button5);

        goit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(Diseases.this,Goiter.class);
                startActivity(go);
            }
        });

    }
}
