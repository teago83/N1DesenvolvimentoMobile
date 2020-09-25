package com.example.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityNotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        Button BotaoTerceiraTela = (Button) findViewById(R.id.BotaoTerceiraTela);
        BotaoTerceiraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IrTerceiraTela = new Intent(ActivityNotas.this, ActivityMedia.class);
                // adicione o esquema de catar o nome da pessoa e passar para a intent
                startActivity(IrTerceiraTela);
            }
        });
    }
}