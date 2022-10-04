package com.cieep.a03_ejercicio02.modelos;

import java.io.Serializable;

public class MotoModel implements Serializable {

    private String marca;
    private String modelo;
    private int cilindrada;

    public MotoModel(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
