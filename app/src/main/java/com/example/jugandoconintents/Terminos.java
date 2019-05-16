package com.example.jugandoconintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Terminos extends AppCompatActivity {
    private CheckBox checkBox;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminos);
        Bundle extras = getIntent().getExtras();
        final String mail= extras.getString("KEY_MAIL");
        final String nombre= extras.getString("KEY_NOMBRE");

        checkBox=findViewById(R.id.checkBox);
        btnAceptar=findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aceptar(nombre, mail);
            }
        });
    }

    void Aceptar(String nombre, String mail){
        if(checkBox.isChecked()){
            Intent intent=new Intent(this, Bienvenido.class);
            intent.putExtra("KEY_MAI", mail);
            intent.putExtra("KEY_NOMB", nombre);

            startActivity(intent);
            finish();

        } else {
            Toast.makeText(this, "Debe Aceptar los términos y condiciones", Toast.LENGTH_SHORT).show();
        }
    }

}
