package com.mycompany.exercicioclassesabstratas.entities;

public class ArmaMelee extends Arma{
    
    protected boolean sangramento;

    public ArmaMelee(boolean sangramento, String nome, int dano) {
        super(nome, dano);
        this.sangramento = sangramento;
    }

    public void atacar(int vezes, double distancia) {
        if(sangramento == true){
            System.out.println("Ataque com sangramento!");
        } else {
            super.atacar(vezes, distancia);
        }
    }

    @Override
    public void atacar(int vezes) {
        
    }
    
    
    
}
