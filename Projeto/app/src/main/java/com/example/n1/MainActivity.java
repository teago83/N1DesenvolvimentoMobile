package com.example.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BotaoSegundaTela = (Button) findViewById(R.id.BotaoSegundaTela);
        BotaoSegundaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IrSegundaTela = new Intent(MainActivity.this, ActivityNotas.class);
                // adicione o esquema de catar o nome da pessoa e passar para a intent
                startActivity(IrSegundaTela);
            }
        });
    }
}