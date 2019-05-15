package com.example.jugandoconintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Bienvenido extends AppCompatActivity {

    private Button btnWeb;
    private ImageButton Autor;
    private TextView txtBienvenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
        Bundle extras= getIntent().getExtras();
        String nombre=extras.getString("KEY_NOMB");
        String mail=extras.getString("KEY_MAI");

        btnWeb=findViewById(R.id.btnWeb);
        Autor=findViewById(R.id.btnAutor2);
        txtBienvenido=findViewById(R.id.txtBienvenido);

        txtBienvenido.setText(txtBienvenido.getText()+ " " + nombre);

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VerWeb();
            }
        });
        Autor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebAutor();
            }
        });

    }

    void VerWeb(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.blockchain.com"));
        startActivity(intent);
    }

    void WebAutor(){
        Intent intent = new Intent(this, WebDeAutor.class);
        startActivity(intent);

    }
}
