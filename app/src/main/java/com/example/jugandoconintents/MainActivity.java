package com.example.jugandoconintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button txtRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRegistrarse=findViewById(R.id.txtRegistrarse);

        txtRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registrarse();
            }
        });


    }

    void Registrarse(){
        Intent intent = new Intent(this, Registro.class );

        startActivity(intent);
        finish();

    }
}
