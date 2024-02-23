package com.example.parcila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

public class factura{
    int camtidad;
    int precio;
    String nombreproducto;

    public factura(int camtidad , int precio, String nombreproducto){
        this.camtidad = camtidad;
        this.precio = precio;
        this.nombreproducto = nombreproducto;
    }

    public int getCamtidad() {
        return camtidad;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void imprimir(int camtidad, int precio, String nombreproducto){
        System.out.println("Se pidio una cantiad de: "+getCamtidad()+"del producto "+getNombreproducto()+"a un precio de: "+getPrecio());
    }
}