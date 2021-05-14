package com.sesion03_ejemplo_varias_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //paso 3: Crear variables de instancia de los componentes gráficos

    EditText cajaUsuario, cajaContraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //paso 4: Instanciar las variables de instancia
        cajaUsuario=findViewById(R.id.caja_usuario);
        cajaContraseña=findViewById(R.id.caja_contraseña);

    }
    //paso 1:
    public void accesoLogin(View v){

        Toast.makeText(getApplicationContext(),
                cajaUsuario.getText().toString(),Toast.LENGTH_LONG).show();

        //Suponer la autenticacion de usuario

        Intent i = new Intent(this,ActivityMenuPrincipal.class);
        startActivity(i);

    }

    //paso 2: enlazar el metodo anterioral boton que generara el evento
    //a traves de su atributo onClick
}