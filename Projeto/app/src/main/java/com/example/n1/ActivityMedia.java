package com.example.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityMedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        TextView NotaNumero1 = (TextView) findViewById(R.id.nota1);
        TextView NotaNumero2 = (TextView) findViewById(R.id.nota2);

        Intent IncomingIntent = getIntent();

        Integer IncomingNota1 = IncomingIntent.getIntExtra("Nota1", 0);
        NotaNumero1.setText(String.valueOf(IncomingNota1));
        Integer IncomingNota2 = IncomingIntent.getIntExtra("Nota2", 0);
        NotaNumero2.setText(String.valueOf(IncomingNota2));
    }
}