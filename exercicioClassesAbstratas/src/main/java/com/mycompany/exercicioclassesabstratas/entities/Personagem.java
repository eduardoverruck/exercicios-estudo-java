package com.mycompany.exercicioclassesabstratas.entities;

public abstract class Personagem {

    private String name;
    private String classe;
    private int level;
    private Arma arma;

    public Personagem(String name, String classe, int level, Arma arma) {
        this.name = name;
        this.classe = classe;
        this.level = level;
        this.arma = arma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personagem{" + "name=" + name + ", classe=" + classe + ", level=" + level + ", arma=" + arma + '}';
    }
    
    public void atacar(int vezes){
        arma.atacar(vezes);
    }
    
}
