package com.example.jugandoconintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    private Button btnRegistrarse;
    private EditText ediTextUsuario;
    private EditText ediTextMail;
    private EditText ediTextPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnRegistrarse=findViewById(R.id.btnRegistrarse);
        ediTextMail=findViewById(R.id.editTextMail);
        ediTextPass=findViewById(R.id.editTextPass);
        ediTextUsuario=findViewById(R.id.editTextNombre);

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registrarse();
            }
        });
    }

    void Registrarse(){
        if(ediTextUsuario.getText().toString().isEmpty() || ediTextPass.getText().toString().isEmpty() || ediTextMail.getText().toString().isEmpty()){
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, Terminos.class);
            intent.putExtra("KEY_NOMBRE", ediTextUsuario.getText().toString());
            intent.putExtra("KEY_MAIL", ediTextMail.getText().toString());

            startActivity(intent);
            finish();
        }
    }
}
