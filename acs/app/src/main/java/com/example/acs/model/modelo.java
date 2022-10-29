package com.example.acs.model;

public class modelo {
    private String Titulo;
    private String Data;
    private String Texto;


    public modelo(String titulo, String data, String texto) {
        this.Titulo = titulo;
        this.Data = data;
        this.Texto = texto;
    }

    public String getTitulo(){
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        this.Data = data;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        this.Texto = texto;
    }
}
