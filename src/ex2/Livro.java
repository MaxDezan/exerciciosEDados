package ex2;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponibilidade = true;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Disponível: " + (disponibilidade ? "Sim" : "Não"));
        System.out.println();
    }

    public void reservar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Livro reservado com sucesso.");
        } else {
            System.out.println("O livro já está reservado.");
        }
    }

    public void devolver() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("O livro não está reservado, não é possível devolver.");
        }
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }
}

