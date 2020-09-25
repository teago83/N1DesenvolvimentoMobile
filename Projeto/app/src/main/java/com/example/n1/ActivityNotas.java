package com.example.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityNotas extends AppCompatActivity {

    // Notas do usuário e EditTexts dos inputs das notas
    Float Nota1, Nota2;
    EditText InputNota1, InputNota2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        // Mensagem com o nome do usuário vindo da primeira tela.
        TextView MensagemNotas = (TextView) findViewById(R.id.MensagemNotas);
        Intent IncomingIntent = getIntent();
        final String IncomingName = IncomingIntent.getStringExtra("Username");
        MensagemNotas.setText("Digite suas notas, " + IncomingName + ".");

        // Magias relacionadas com a intent que estará levando o usuário à terceira tela.
        InputNota1 = (EditText) findViewById(R.id.nota1);
        InputNota2 = (EditText) findViewById(R.id.nota2);

        Button BotaoTerceiraTela = (Button) findViewById(R.id.BotaoTerceiraTela);
        BotaoTerceiraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nota1 = Float.valueOf(InputNota1.getText().toString()); // Essa função "Integer.valueOf()" é bem interessante e útil. Tente lembrar-se dela.
                Nota2 = Float.valueOf(InputNota2.getText().toString());

                Intent IrTerceiraTela = new Intent(ActivityNotas.this, ActivityMedia.class);
                IrTerceiraTela.putExtra("Nota1", Nota1);
                IrTerceiraTela.putExtra("Nota2", Nota2);
                IrTerceiraTela.putExtra("Nome", IncomingName);
                startActivity(IrTerceiraTela);
            }
        });
    }

    // Função usada para testes
    private void showToast(String valor){
        Toast.makeText(ActivityNotas.this, valor, Toast.LENGTH_LONG).show();
    }
}