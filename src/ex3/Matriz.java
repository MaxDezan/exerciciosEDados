package ex3;

public class Matriz {

    private int[][] matriz;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        matriz = new int[linhas][colunas];
    }

    public void setValor(int linha, int coluna, int valor) {
        matriz[linha][coluna] = valor;
    }

    public int getMaiorElemento() {
        int maior = matriz[0][0];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }

    public int getMenorElemento() {
        int menor = matriz[0][0];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return menor;
    }

    public double calcularMedia() {
        return (double) calcularSomaTotal() / (linhas * colunas);
    }

    public int calcularSomaTotal() {
        int soma = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }

    public int contarOcorrencias(int valor) {
        int contador = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == valor) {
                    contador++;
                }
            }
        }

        return contador;
    }
}
