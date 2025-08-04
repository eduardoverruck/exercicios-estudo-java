package entities;

public class Product {

    private String nome;
    private Double preco;
    private Integer quantidade;

    public Product(){
        
    }
    
    public Product(String nome) {
        this.nome = nome;
    }

    public Product(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Product(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    
    
}
