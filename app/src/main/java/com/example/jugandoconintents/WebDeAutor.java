package com.example.jugandoconintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WebDeAutor extends AppCompatActivity {
    private Button btnGithub;
    private Button btnTelefono;
    String repositorio="https://www.github.com/matiasdr";
    String telefono="+542954390619";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_de_autor);

        btnGithub=findViewById(R.id.btnGithub);
        btnTelefono=findViewById(R.id.btnTelefono);

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

    void Repositorio(){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(repositorio));
        startActivity(i);
    }

    void MarcarTelefono(){
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse(telefono));
        startActivity(i);
    }
}

