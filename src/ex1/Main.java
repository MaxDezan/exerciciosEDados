package ex1;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("max", "@");
        Aluno a2 = new Aluno("bia", "@");
        Aluno a3 = new Aluno("mia", "@");
        Professor p1 = new Professor("paulo", "@");
        Turma t1 = new Turma("123", "estrutura de dados");

        t1.inserirAluno(a1);
        t1.inserirAluno(a2);
        t1.inserirAluno(a3);
        t1.listarAlunos();

        a1.logar();
        p1.logar();
    }
}