package com.mycompany.exercicioclassesabstratas.entities;

public class PersonagemMago extends Personagem{

    private String elemento;

    public PersonagemMago(String elemento, String name, String classe, int level, Arma arma) {
        super(name, classe, level, arma);
        this.elemento = elemento;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

}
