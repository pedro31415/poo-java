//herança
public final class Aluno extends Pessoa{
    //atributos
    private String matricula;
    //encapsulamento
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula.toUpperCase();
    }
    //polimorfismo
    public void mostrarDados(){
        System.out.printf("\n%s tem %d anos de idade e possui a matricula: %s\n", this.getNome(), this.getIdade(), this.getMatricula());
    }
    public void estudar(){
        System.out.println(this.getNome() + " esta estudando muito");
    }
}
