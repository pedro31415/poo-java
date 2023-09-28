public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private double salario;

    //Encapsulamentos
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) throws Exception{
        int qtdePalavras = nome.trim().split("").length;
        if(qtdePalavras > 1){
            this.nome = nome;
        } else {
            throw new Exception("Nome deve ter pelo menos duas letras");
        }
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) throws Exception{
        if(idade > 0){
            this.idade = idade;
        } else {
            throw new Exception("Idade negativa ou com termo nulo é inválido");
        }
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario) throws Exception{
        if(salario > 0){
            this.salario = salario;
        } else {
            throw new Exception("O salario deve ser maior que 0");
        }
    }

    //Construtores
    public Pessoa(){
        this.nome = "Sem nome";
        this.idade = 0;
        this.salario = 1300;
    }

    public Pessoa(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //métodos
    public void mostrarDados(){
        System.out.printf("%s tem %d anos de idade  com um salario: %f\n", this.getNome(), this.getIdade(), this.getSalario());
    }
    public void tiraCarteira(){
        if(this.idade >= 18){
            System.out.println("Permissão para tirar a carteira");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}
