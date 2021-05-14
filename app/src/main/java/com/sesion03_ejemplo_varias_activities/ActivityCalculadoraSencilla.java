package com.sesion03_ejemplo_varias_activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.lang.Math;
import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.core.app.RemoteInput;

public class ActivityCalculadoraSencilla extends Activity {

    EditText caja;
    String cache="";
    char op = ' ';
    String memoria = "";

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora_sencilla);
        caja = findViewById(R.id.caja);
    }

    public void btn0(View v){
        caja.append("0");
    }
    public void btn1(View v){
        caja.append("1");
    }
    public void btn2(View v){
        caja.append("2");
    }
    public void btn3(View v){
        caja.append("3");
    }
    public void btn4(View v){
        caja.append("4");
    }
    public void btn5(View v){
        caja.append("5");
    }
    public void btn6(View v){
        caja.append("6");
    }
    public void btn7(View v){
        caja.append("7");
    }
    public void btn8(View v){
        caja.append("8");
    }
    public void btn9(View v){
        caja.append("9");
    }
    public void btnDot(View v){
        if (!caja.getText().toString().contains(".")) {
            caja.append(".");
        }
    }

    public void btnSuma(){
        cache = caja.getText().toString();
        op='+';
    }
    public void btnResta(){
        cache = caja.getText().toString();
        op='-';
    }
    public void btnMultiplicacion(){
        cache = caja.getText().toString();
        op='*';
    }
    public void btnDivision(){
        cache = caja.getText().toString();
        op='/';
    }
    public void btnResiduo(View v){
        cache = caja.getText().toString();
        op='%';
    }
    public void btnCuadrado(View v){
        double x = Double.parseDouble(caja.getText().toString());
        x = Math.pow(x,2);
        caja.setText(""+x);
    }
    public void btnRaiz(View v){
        double x = Double.parseDouble(caja.getText().toString());
        if (x>0) {
            x = Math.sqrt(x);
            caja.setText(""+x);
        }
    }
    public void btnEntreX(View v){
        double x = Double.parseDouble(caja.getText().toString());
        if (x!=0){
            x = 1/x;
        }
        caja.setText(""+x);
    }
    public void btnMasMenos(View v){
        double x = Double.parseDouble(caja.getText().toString());
        x = -x;
        caja.setText(""+x);
    }
    public void btnIgual(View v){
        double num1 = Double.parseDouble(cache);
        double num2 = Double.parseDouble(caja.getText().toString());
        double num3 = 0;
        switch (op) {
            case '+':
                num3=num1+num2;
                break;
            case '-':
                num3=num1-num2;
                break;
            case '*':
                num3=num1*num2;
                break;
            case '/':
                num3=num1/num2;
                break;
            case '%':
                num3=num1%num2;
                break;
            default:
                break;
        }
        caja.setText(""+num3);
    }
    public void btnDel(View v){
        if (caja.getText().toString().length()>0) {
            caja.setText(caja.getText().toString().substring(0, caja.getText().toString().length()-1));
        }
    }
    public void btnCE(View v){
        memoria = "";
        op = ' ';
        cache = "";
        caja.setText("");
    }
    public void btnC(View v){
        caja.setText("");
    }
    public void btnMemAlmacenar(View v){
        memoria=caja.getText().toString();
    }
    public void btnMemResta(View v){
        double num = Double.parseDouble(memoria)-Double.parseDouble(caja.getText().toString());
        memoria = ""+num;
    }
    public void btnMemSuma(View v){
        double num = Double.parseDouble(memoria)+Double.parseDouble(caja.getText().toString());
        memoria = ""+num;
    }
    public void btnMemTope(View v){
        caja.setText(memoria);
    }
    public void btnMemBorrar(View v){
        memoria="";
    }


}
