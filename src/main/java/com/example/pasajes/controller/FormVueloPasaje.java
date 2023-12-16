package com.example.pasajes.controller;

public class FormVueloPasaje {
    private String nroVuelo;

    public String getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(String nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    @Override
    public String toString() {
        return "FormVueloPasaje [nroVuelo=" + nroVuelo + "]";
    }

    public FormVueloPasaje() {
    }

    public FormVueloPasaje(String nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    
    
}
