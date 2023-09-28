public class App {
    public static void main(String[] args) throws Exception {
        //instanciando um objeto
        Pessoa p1 = new Pessoa();
        //p1.nome = "Pedro";
        p1.setNome("Rogerio");
        //p1.idade = 21;
        p1.setIdade(20);
        p1.getNome();
        //System.out.println("O seu nome " + p1.nome  + " Sua idade é " + p1.idade);
        Pessoa p2 = new Pessoa();
        //p2.nome = "Carlos";
        p2.setNome("Roberto Carlos");
        //p2.idade = 24;
        //p2.setIdade(20);
        p1.mostrarDados();
        p2.mostrarDados();
        p1.tiraCarteira();
        Pessoa p3 = new Pessoa("Rogerio", 26, 4000);
        p3.mostrarDados();
        Carro c1 = new Carro(22, "red", "porsche");
        c1.mostrarDadosCar();
        Aluno a1 = new Aluno();
        a1.setNome("Pedro");
        a1.setMatricula("20221bcc0014");
        a1.mostrarDados();
        Aluno a2 = new Aluno();
        a2.setNome("Romario");
        a2.estudar();
        
        // System.out.println(("Esta é a matricula de " + a1.getNome() + ": " + a1.getMatricula()));
    }
}
