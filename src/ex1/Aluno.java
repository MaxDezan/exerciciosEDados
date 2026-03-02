package ex1;

public class Aluno extends Pessoa {
    @Override
    public void logar() {
        System.out.println("Aluno logado");
    }

    public Aluno(String nome, String email) {
        super(nome, email);
    }

}
