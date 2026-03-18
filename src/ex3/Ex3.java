import ex3.*;

void main() {

    Vetor v = new Vetor(3);

    v.adicionar("Ana");
    v.adicionar("Carlos");
    v.adicionar("Maria");

    System.out.println(v);

    v.adicionar(1, "Joao");
    System.out.println(v);

    System.out.println(v.obter(2));

    v.alterar(0, "Pedro");
    System.out.println(v);

    v.remover(2);
    System.out.println(v);

    v.remover("Joao");
    System.out.println(v);

    System.out.println(v.contem("Maria"));

    System.out.println(v.tamanho());

    System.out.println(v.estaVazio());

    v.limpar();
    System.out.println(v);


    Matriz m = new Matriz(3,3);

    m.setValor(0,0,5);
    m.setValor(0,1,10);
    m.setValor(0,2,15);

    m.setValor(1,0,20);
    m.setValor(1,1,25);
    m.setValor(1,2,30);

    m.setValor(2,0,10);
    m.setValor(2,1,40);
    m.setValor(2,2,50);

    System.out.println(m.getMaiorElemento());
    System.out.println(m.getMenorElemento());
    System.out.println(m.calcularSomaTotal());
    System.out.println(m.calcularMedia());
    System.out.println(m.contarOcorrencias(10));
}