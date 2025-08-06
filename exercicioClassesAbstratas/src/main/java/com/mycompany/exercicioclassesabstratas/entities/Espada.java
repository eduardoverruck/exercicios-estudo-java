package com.mycompany.exercicioclassesabstratas.entities;

import com.mycompany.exercicioclassesabstratas.enums.TamanhoEspada;

public class Espada extends ArmaMelee{
    
    private TamanhoEspada tamanho;
    private EspadaFabricante fabricante;

    public Espada(TamanhoEspada tamanho, EspadaFabricante fabricante, boolean sangramento, String nome, int dano) {
        super(sangramento, nome, dano);
        this.tamanho = tamanho;
        this.fabricante = fabricante;
    }
    
    
            
}
