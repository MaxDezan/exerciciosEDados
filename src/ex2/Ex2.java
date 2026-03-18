import ex2.*;

void main() {
    Livro l1 = new Livro("crime e castigo", "dostoievsky", 432);
    Livro l2 = new Livro("orgulho e preconceito", "jane austen", 520);
    Livro l3 = new Livro("o anticristo", "nietzsche", 327);
    Livraria lv1 = new Livraria("Sebo café");

    lv1.inserirLivro(l1);
    lv1.inserirLivro(l2);
    lv1.inserirLivro(l3);

    lv1.listarLivros();
    lv1.listarDisponiveis();
    l1.exibirDetalhes();
    l1.reservar();
    l1.reservar();
    lv1.listarDisponiveis();
    l1.devolver();
}
