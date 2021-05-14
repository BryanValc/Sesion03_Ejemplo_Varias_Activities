package com.sesion03_ejemplo_varias_activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class ActivityMenuPrincipal extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

    }

    public void accesoCalculadoraSencilla(View v){
        Intent i = new Intent(this, ActivityCalculadoraSencilla.class);
        startActivity(i);

    }


}
