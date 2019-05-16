package com.example.jugandoconintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button txtRegistrarse;
    private ImageButton btnAutor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRegistrarse=findViewById(R.id.txtRegistrarse);
        btnAutor=findViewById(R.id.btnAutor);
        txtRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registrarse();
            }
        });
        btnAutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VerAutor();
            }
        });

    }

    void Registrarse(){
        Intent intent = new Intent(this, Registro.class );

        startActivity(intent);
        finish();

    }

    void VerAutor(){
        Intent i = new Intent(this, WebDeAutor.class);
        startActivity(i);
    }
}
