package com.mycompany.exerciciolist;

import java.util.Scanner;
import java.util.Locale;
import entities.Veiculo;
import java.util.ArrayList;
import java.util.Arrays;

public class ExercicioList {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        ArrayList<Veiculo> listaVeiculo = new ArrayList<>();
        
        System.out.println("Quantos carros vc vai digitar? ");
        int n = input.nextInt();
        input.nextLine();
        
        Veiculo viper = new Veiculo("Viper", 230.00, 318.00, 2002);
        Veiculo ferrari = new Veiculo("Ferrari", 290.00, 580.00, 2014);
        Veiculo uno = new Veiculo("Uno", 20.00, 500.00, 2000);
        
        listaVeiculo.addAll(Arrays.asList(viper, ferrari, uno));
        
        System.out.println(listaVeiculo);
        
        ferrari.arredondarVelocidade(450.32);
        
        input.close();
    }
}
