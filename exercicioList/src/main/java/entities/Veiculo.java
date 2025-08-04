package entities;

public class Veiculo {

    private String nome;
    private Double price;
    private Double maxSpeed;
    private int ano;
    private int velArredondado;
    
    public Veiculo(){
        
    }

    public Veiculo(String nome, Double price, Double maxSpeed, int ano) {
        this.nome = nome;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.ano = ano;
    }

    public void arredondarVelocidade(double maxSpeed){
        velArredondado = (int) maxSpeed;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "nome=" + nome + ", price=" + price + ", maxSpeed=" + maxSpeed + ", ano=" + ano + '}';
    }
    
    
    
}
