package com.example.jugandoconintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WebDeAutor extends AppCompatActivity {
    private Button btnGithub;
    private Button btnTelefono;
    private Button buttonConsulta;
    String repositorio="https://www.github.com/matiasdr";
    String telefono="+542954390619";
    EditText txtConsulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_de_autor);

        btnGithub=findViewById(R.id.btnGithub);
        btnTelefono=findViewById(R.id.btnTelefono);
        buttonConsulta=findViewById(R.id.buttonConsulta);
        txtConsulta=findViewById(R.id.editTextConsulta);
        buttonConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConsultaMail();
            }
        });
        btnGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Repositorio();
            }
        });

        btnTelefono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            MarcarTelefono();
            }
        });
    }

    private void ConsultaMail() {
        if(txtConsulta.getText().toString().isEmpty()){
            Toast.makeText(this, "Escribi algo por favor", Toast.LENGTH_SHORT).show();
        }else {
            Intent i = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:"));
            i.putExtra(i.EXTRA_EMAIL, "matias.draeger@hotmail.com");
            i.putExtra(i.EXTRA_SUBJECT, "CONSULTA");
            i.putExtra(i.EXTRA_TEXT, txtConsulta.getText().toString());
            startActivity(i);
        }
    }

    void Repositorio(){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(repositorio));
        startActivity(i);
    }

    void MarcarTelefono(){
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse(telefono));
        startActivity(i);
    }
}

