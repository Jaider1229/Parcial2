package com.example.parcila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
public class factura2 extends factura{
    String tipoprodu;

    public factura2(int camtidad, int precio, String nombreproducto, String tipoprodu){
      super(camtidad, precio, nombreproducto);
      this.tipoprodu = tipoprodu;
    }

    public String getTipoprodu() {
        return tipoprodu;
    }

    public void imprimir(int camtidad, int precio, String nombreproducto, String tipoprodu){
        System.out.println(" La cantiad que se pidio es de: "+getCamtidad()+" del producto "+getNombreproducto()+" Tiene un precio de: "+getTipoprodu());
    }
}
