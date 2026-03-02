package ex2;

import ex1.Aluno;

public class Livraria {
    private Livro livro;
    private Livro[] livros;
    private int tamanho;
    private String nome;

    public Livraria(String nome) {
        this.tamanho = 0;
        this.nome = nome;
        livros = new Livro[300];
    }

    public void inserirLivro(Livro livro) {
        if (tamanho < livros.length) {
            livros[tamanho] = livro;
            tamanho++;
        }
    }

    public void listarLivros() {
        for (int i = 0; i < tamanho; i++) {
            livros[i].exibirDetalhes();
        }
    }

    public void listarDisponiveis() {
        for (int i = 0; i < tamanho; i++) {
            if (livros[i].isDisponivel()) {
                livros[i].exibirDetalhes();
            }
        }
    }
}