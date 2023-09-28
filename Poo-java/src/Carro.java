public class Carro {
    //atributos
    double velocidade;
    String cor;
    String modelo;
    //construtor
    public Carro(double velocidade, String cor, String modelo){
        this.velocidade = velocidade;
        this.cor = cor;
        this.modelo = modelo;
    }

    public void mostrarDadosCar(){
        System.out.printf("Modelo do carro: %s\nVelocidade do carro: %f\nCor do carro: %s", this.modelo, this.velocidade, this.cor);
    }

}
