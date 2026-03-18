package ex4;

public class Ordenar {
    public void bubbleSort(double[] vetor, boolean decrescente){
        int n = vetor.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                boolean condicao = decrescente ? vetor[j] < vetor[j+1] : vetor[j] > vetor[j+1];
                if(condicao) {
                    double temp = vetor[j];
                    vetor[j] = vetor [j + 1];
                    vetor [j + 1] = temp;
                }
            }
        }
    }

    public void bubbleSort(int[] vetor, boolean decrescente){
        int n = vetor.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                boolean condicao = decrescente ? vetor[j] < vetor[j+1] : vetor[j] > vetor[j+1];
                if(condicao) {
                    int temp = vetor[j];
                    vetor[j] = vetor [j + 1];
                    vetor [j + 1] = temp;
                }
            }
        }
    }

    public void bubbleSort(Funcionario[] vetor, boolean decrescente) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // compareTo retorna > 0 se a primeira String for "maior" que a segunda
                int comparacao = vetor[j].getNome().compareToIgnoreCase(vetor[j + 1].getNome());
                boolean condicao = decrescente ? comparacao < 0 : comparacao > 0;
                
                if (condicao) {
                    Funcionario temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] vetor, boolean decrescente){
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceAlvo = i;
            for(int j = i + 1; j < n; j++){
                boolean condicao = decrescente ? vetor[j] > vetor[indiceAlvo] : vetor[j] < vetor[indiceAlvo];
                if(condicao){
                    indiceAlvo = j;
                }
            }
            int temp = vetor[indiceAlvo];
            vetor[indiceAlvo] = vetor[i];
            vetor[i] = temp;
        }
    }

    public void insertionSort(int[] vetor, boolean decrescente) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int key = vetor[i];
            int j = i - 1;
            
            while (j >= 0 && (decrescente ? vetor[j] < key : vetor[j] > key)) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = key;
        }
    }
}
