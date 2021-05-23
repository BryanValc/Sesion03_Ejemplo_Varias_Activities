package com.sesion03_ejemplo_varias_activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ActivityCalculadoraCientifica extends Activity implements View.OnClickListener {

    RadioButton radioB, radioO, radioH, radioD;
    EditText caja, cajaBinario, cajaOctal, cajaHexadecimal;
    CheckBox checkBoxBinario,checkBoxOctal,checkBoxHexadecimal;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_cientifica);

        radioB = findViewById(R.id.radio_decimal);
        radioO = findViewById(R.id.radio_binario);
        radioH = findViewById(R.id.radio_octal);
        radioD = findViewById(R.id.radio_hexadecimal);

        caja = findViewById(R.id.caja_numero_a_convertir);
        cajaBinario = findViewById(R.id.caja_binario);
        cajaOctal = findViewById(R.id.caja_octal);
        cajaHexadecimal = findViewById(R.id.caja_hexadecimal);

        checkBoxBinario = findViewById(R.id.checkBox_binario);
        checkBoxOctal = findViewById(R.id.checkBox_octal);
        checkBoxHexadecimal = findViewById(R.id.checkBox_hexadecimal);

    }

    public void reestablecerCajas(){
        cajaBinario.setText("");
        cajaOctal.setText("");
        cajaHexadecimal.setText("");
    }

    public String binToOct(String bin){
        int bnum = Integer.parseInt(bin, 2);
        return Integer.toOctalString(bnum);
    }
    public String binToHex(String bin){
        int bnum = Integer.parseInt(bin, 2);
        return Integer.toHexString(bnum);
    }
    public String octToBin(String oct){
        int onum = Integer.parseInt(oct,8);
        return Integer.toOctalString(onum);
    }
    public String octToHex(String oct){
        int onum = Integer.parseInt(oct,8);
        return Integer.toHexString(onum);
    }
    public String decToBin(String dec){
        int dnum = Integer.parseInt(dec);
        return Integer.toBinaryString(dnum);
    }
    public String decToOct(String dec){
        int dnum = Integer.parseInt(dec);
        return Integer.toOctalString(dnum);
    }
    public String decToHex(String dec){
        int dnum = Integer.parseInt(dec);
        return Integer.toHexString(dnum);
    }
    public String hexToBin(String hex){
        int hnum = Integer.parseInt(hex,16);
        return Integer.toBinaryString(hnum);
    }
    public String hexToOct(String hex){
        int hnum = Integer.parseInt(hex,16);
        return Integer.toOctalString(hnum);
    }

    public void verificar(View v){
        if(radioB.isChecked())
            Toast.makeText(this, "BINARIO", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Log.i("MSJ->", "Esto tambien se ejecuta");
        if(radioB.isChecked())
            Toast.makeText(this, "BINARIO", Toast.LENGTH_LONG).show();
    }

    public void presionarRadioButton(@Nullable  View v){

        boolean checked = ((RadioButton) v).isChecked();
        if (checked){
            reestablecerCajas();
        }
        switch(v.getId()) {
            case R.id.radio_binario:
                if (checked)
                    Toast.makeText(this, "Convirtiendo a BINARIO", Toast.LENGTH_LONG).show();
                break;
            case R.id.radio_octal:
                if (checked)
                    Toast.makeText(this, "Convirtiendo a OCTAL", Toast.LENGTH_LONG).show();
                break;
            case R.id.radio_decimal:
                if (checked)
                    Toast.makeText(this, "Convirtiendo a DECIMAL", Toast.LENGTH_LONG).show();
                break;
            case R.id.radio_hexadecimal:
                if (checked)
                    Toast.makeText(this, "Convirtiendo a HEXADECIMAL", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
