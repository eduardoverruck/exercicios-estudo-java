package com.mycompany.exercicioclassesabstratas.entities;

public abstract class Arma {

    protected String nome;
    protected int dano;
    
    public abstract void atacar(int vezes);
    
    public void atacar(int vezes, double distancia){
        System.out.println("atacar");
    }

    public Arma(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    
    
    
}
