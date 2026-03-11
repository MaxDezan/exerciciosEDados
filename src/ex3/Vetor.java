package ex3;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    public void adicionar(String elemento) {
        if (tamanho == elementos.length) {
            aumentarCapacidade();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void adicionar(int posicao, String elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        if (tamanho == elementos.length) {
            aumentarCapacidade();
        }

        for (int i = tamanho; i > posicao; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[posicao] = elemento;
        tamanho++;
    }

    public String obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    public void alterar(int posicao, String novoValor) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        elementos[posicao] = novoValor;
    }

    private void aumentarCapacidade() {
        String[] novo = new String[elementos.length * 2];

        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }

        elementos = novo;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[tamanho - 1] = null;
        tamanho--;
    }

    public void remover(String valor) {
        int indice = indexOf(valor);
        if (indice != -1) {
            remover(indice);
        }
    }

    public boolean contem(String valor) {
        return indexOf(valor) != -1;
    }

    private int indexOf(String valor) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}