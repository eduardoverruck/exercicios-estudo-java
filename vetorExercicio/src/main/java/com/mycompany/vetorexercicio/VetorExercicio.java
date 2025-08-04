package com.mycompany.vetorexercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorExercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = coletarDados(sc);
        
        //fazer o vetor e pegar o maior e menor
        int[] vetor = criarVetor(n, sc);
        
        System.out.println("O maior é: " + maior(vetor));
        
        System.out.println("O menor é: " + menor(vetor));
    }
    
    public static int coletarDados(Scanner sc){
        
        try{
            System.out.print("Quantos numeros voce vai digitar? ");
            Double numero = sc.nextDouble();
            //isso acontece por que se houver um excessao em cima ele não vai ler a linha abaixo
            sc.nextLine();
            
            int newNumber = (int) Math.round(numero);
            
            return newNumber;
            
        } catch (InputMismatchException e){
            sc.nextLine();
            System.out.println("Erro! Isso não é um numero, digite novamente");
            
            return coletarDados(sc);
            
        }
    }
    
    public static int[] criarVetor(int n, Scanner sc){
        
        int[] vetor = new int[n];
        
        for (int i=0; i<n; i++){
            System.out.println("Digite o numero para armazenar no vetor {casa "+ (i+1) + "}");
            vetor[i] = sc.nextInt();
            sc.nextLine();
            
        }
        
        return vetor;
        
    }
 
    public static int maior(int[] vetor){
        
        int maior = 0;
        for (int i : vetor){
            if (i > maior) maior = i;
        }
        
        return maior;
        
    }
    
    public static int menor(int[] vetor){
        int menor = vetor[0];
        for(int i : vetor){
            if(i < menor) menor = i;
        }
        
        return menor;
        
    }
    
}
