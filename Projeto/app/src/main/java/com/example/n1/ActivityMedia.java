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

        //String IncomingNota1 = IncomingIntent.getIntExtra("Nota1", )
        //NotaNumero1.setText("4");
        //String IncomingNota2 = IncomingIntent.getStringExtra("Nota2");
        //NotaNumero2.setText(IncomingNota2);
    }
}

/*      // Mensagem com o nome do usuário vindo da primeira tela.
        TextView MensagemNotas = (TextView) findViewById(R.id.MensagemNotas);
        Intent IncomingIntent = getIntent();
        String IncomingName = IncomingIntent.getStringExtra("Username");
        MensagemNotas.setText("Digite suas notas, " + IncomingName + ".");*/