package com.example.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String Name;
    EditText InputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputName = (EditText) findViewById(R.id.nome);

        Button BotaoSegundaTela = (Button) findViewById(R.id.BotaoSegundaTela);
        BotaoSegundaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name = InputName.getText().toString();
                Intent IrSegundaTela = new Intent(MainActivity.this, ActivityNotas.class);

                IrSegundaTela.putExtra("Username", Name);
                startActivity(IrSegundaTela);
            }
        });
    }
}