package com.example.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class ActivityMedia extends AppCompatActivity {

    WebView Gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        Gif = findViewById(R.id.resultGif);
        WebSettings ws = Gif.getSettings();
        ws.setJavaScriptEnabled(true);
        String FileLocation1 = "file:android_asset/parabains1.gif";
        String FileLocation2 = "file:android_asset/F.gif";
        String FileLocation3 = "file:android_asset/over9000.gif";

        TextView NotaNumero1 = (TextView) findViewById(R.id.nota1);
        TextView NotaNumero2 = (TextView) findViewById(R.id.nota2);
        TextView Media = (TextView) findViewById(R.id.media);
        TextView ParabensOuNen = (TextView) findViewById(R.id.parabensOuNen);

        Intent IncomingIntent = getIntent();

        String IncomingNome = IncomingIntent.getStringExtra("Nome");
        Float IncomingNota1 = IncomingIntent.getFloatExtra("Nota1", 0);
        NotaNumero1.setText(String.valueOf(IncomingNota1));
        Float IncomingNota2 = IncomingIntent.getFloatExtra("Nota2", 0);
        NotaNumero2.setText(String.valueOf(IncomingNota2));
        Float MediaFinal = (IncomingNota1 + IncomingNota2)/2;
        Media.setText(String.valueOf(MediaFinal));

        if (MediaFinal >= 6 || MediaFinal <= 10){
            ParabensOuNen.setText("Você não reprovou, " + IncomingNome + "! Parabains!!!");
            Gif.loadUrl(FileLocation1);
        }
        if (MediaFinal < 6){
            ParabensOuNen.setText("Você reprovou, " + IncomingNome + "! F! :(");
            Gif.loadUrl(FileLocation2);
        }
        if (MediaFinal > 10){
            ParabensOuNen.setTextSize(21);
            ParabensOuNen.setText("Espere um minuto, " + IncomingNome + "... sua média final foi mais de 10? Isso deve estar quebrado...");
            Gif.loadUrl(FileLocation3);
        }

    }
}