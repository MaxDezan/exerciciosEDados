package ex1;

public class Turma {
    private String id;
    private String nome;
    private Professor professor;
    private Aluno[] alunos;
    private int tamanho;

    public Turma(String id, String nome){
        this.id = id;
        this.nome = nome;
        this.tamanho = 0;
        alunos = new Aluno[40];
    }
     public void inserirAluno(Aluno aluno){
        if (tamanho < alunos.length) {
            alunos[tamanho] = aluno;
            tamanho ++;
        }
     }
     public void listarAlunos(){
         for (int i = 0; i < tamanho; i++) {
             System.out.println(alunos[i]);
         }
     }

}
