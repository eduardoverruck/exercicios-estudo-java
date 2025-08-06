package com.mycompany.exercicioclassesabstratas.entities;

public class PersonagemGuerreiro extends Personagem{

    private String tipo;
    private String legiao;
    private String moral;
    private String estiloDeLuta;

    public PersonagemGuerreiro(String tipo, String legiao, String moral, String estiloDeLuta, String name, String classe, int level, Arma arma) {
        super(name, classe, level, arma);
        this.tipo = tipo;
        this.legiao = legiao;
        this.moral = moral;
        this.estiloDeLuta = estiloDeLuta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLegiao() {
        return legiao;
    }

    public void setLegiao(String legiao) {
        this.legiao = legiao;
    }

    public String getMoral() {
        return moral;
    }

    public void setMoral(String moral) {
        this.moral = moral;
    }

    public String getEstiloDeLuta() {
        return estiloDeLuta;
    }

    public void setEstiloDeLuta(String estiloDeLuta) {
        this.estiloDeLuta = estiloDeLuta;
    }

    @Override
    public void atacar(int vezes){
        double dano = MultiplicadorDeDanoDeAtaque();
    }
    
    public double MultiplicadorDeDanoDeAtaque(){
        switch (estiloDeLuta){
            case "defense":
                return 0.8;
            case "standart":
                return 1.0;
            case "attack":
                return 1.2;
            case "berserker":
                return 2.3;
            default:
                System.out.println("Estilo nao encontrado!");
                return 0;
                // aqui seria uma nova chamada para digitar o estilo de luta
        }
    }
    
}
