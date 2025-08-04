package com.mycompany.exerciciosobrecarga;

import entities.Product;

public class ExercicioSobrecarga {

    public static void main(String[] args) {
    
        
        String nome = "martelo";
        Double preco = 40.20;
        Integer quantidade = 5;
        
        int n = 1;
        
        //sobrecarga:
        //quando cria-se mais de um construtor e se pode criar o mesmo objeto passando diferentes argumentos;
        
        if (n == 1){
            Product product = new Product();
        } else if (n == 2){
            Product product = new Product(nome);
        } else if (n == 3){
            Product product = new Product(nome, preco);
        } else if (n == 4){
            Product product = new Product(nome, preco, quantidade);
        }
        
        
    }
}
