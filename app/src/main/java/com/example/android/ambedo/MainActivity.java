package com.example.android.ambedo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hipHop = (TextView) findViewById(R.id.hiphop);
        hipHop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent hipHopIntent = new Intent(MainActivity.this, Hiphop.class);
                startActivity(hipHopIntent);
            }
        });

        TextView metal = (TextView) findViewById(R.id.metal);
        metal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent metalIntent = new Intent(MainActivity.this, Metal.class);
                startActivity(metalIntent);
            }
        });

        TextView rock = (TextView) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, Rock.class);
                startActivity(rockIntent);
            }
        });
    }
}