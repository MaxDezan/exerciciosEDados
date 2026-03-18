import ex4.*;
import java.util.Arrays;

void main() {
    Ordenar ordena = new Ordenar();
    int[] numeros = {8, 5, 13, 67, 12, 103, -4, 8};

    ordena.insertionSort(numeros, false);
    System.out.println("Insertion Sort (Crescente): " + Arrays.toString(numeros));

    ordena.insertionSort(numeros, true);
    System.out.println("Insertion Sort (Decrescente): " + Arrays.toString(numeros));

    ordena.selectionSort(numeros, false);
    System.out.println("Selection Sort (Crescente): " + Arrays.toString(numeros));

    ordena.selectionSort(numeros, true);
    System.out.println("Selection Sort (Decrescente): " + Arrays.toString(numeros));

    ordena.bubbleSort(numeros, false);
    System.out.println("Bubble Sort (Crescente): " + Arrays.toString(numeros));

    ordena.bubbleSort(numeros, true);
    System.out.println("Bubble Sort (Decrescente): " + Arrays.toString(numeros));

    //funcionarios

    Funcionario[] funcionarios = {
        new Funcionario("Max", 5.255),
        new Funcionario("João", 3.239),
        new Funcionario("Marcos", 1.786)
    };

    double[] salarios = new double[funcionarios.length];
    for (int i = 0; i < funcionarios.length; i++) {
        salarios[i] = funcionarios[i].getSalario();
    }

    ordena.bubbleSort(salarios, false);

    System.out.println("Salários Ordenados: " + Arrays.toString(salarios));

    System.out.println("\nOrdenação por Nome:");
    ordena.bubbleSort(funcionarios, false);
    for (Funcionario f : funcionarios) {
        System.out.println(f.getNome());
    }
}
