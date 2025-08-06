package com.mycompany.exercicioclassesabstratas;

import com.mycompany.exercicioclassesabstratas.entities.Arma;
import com.mycompany.exercicioclassesabstratas.entities.ArmaMelee;
import com.mycompany.exercicioclassesabstratas.entities.Espada;
import com.mycompany.exercicioclassesabstratas.entities.EspadaFabricante;
import com.mycompany.exercicioclassesabstratas.entities.Personagem;
import com.mycompany.exercicioclassesabstratas.entities.PersonagemGuerreiro;
import com.mycompany.exercicioclassesabstratas.enums.EstiloDeLuta;
import com.mycompany.exercicioclassesabstratas.enums.TamanhoEspada;

public class ExercicioClassesAbstratas {

    public static void main(String[] args) {

        Personagem personagem1 = new PersonagemGuerreiro(
            "contratado",
            "Serpentes Pratas",
            "media",
            EstiloDeLuta.attack,
            "Rondan",
            "b",
            83,
            new Espada(
                TamanhoEspada.media,
                new EspadaFabricante("Seu Jorge do grau", 1.7),
                true,
                "FireStorm",
                47
            )
        );
        
        Personagem personagem2 = new PersonagemGuerreiro("warror", "sem", "alta", EstiloDeLuta.berserker, "z7", "s", 470, new Espada(TamanhoEspada.dragonSlayer, new EspadaFabricante("Miraborn", 2.7), true, "Zaratorn", 837));
        
        personagem1.atacar(2);
        
        personagem2.atacar(1, 30);
    }
}
