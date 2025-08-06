package com.mycompany.exercicioclassesabstratas.entities;

public abstract class ArmaADistancia extends Arma{
    
    private double distanciaMaxDeAtaque;

    public ArmaADistancia(String nome, int dano, double distanciaMaxDeAtaque) {
        super(nome, dano);
        this.distanciaMaxDeAtaque = distanciaMaxDeAtaque;
    }

    public double getDistanciaMaxDeAtaque() {
        return distanciaMaxDeAtaque;
    }

    public void setDistanciaMaxDeAtaque(double distanciaMaxDeAtaque) {
        this.distanciaMaxDeAtaque = distanciaMaxDeAtaque;
    }
    
    @Override
    public void atacar(int vezes, double distancia){
        if(estaNoAlcance(distancia)){
            for (int i=1; i<=vezes; i++){
                System.out.println("attack...");
            }
        }
    }
    
    public boolean estaNoAlcance(double distancia){
        if(distancia <= distanciaMaxDeAtaque) return true;
        return false;
    }
    
}
