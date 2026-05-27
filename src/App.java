import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("  1 - Bubble Sort");
        System.out.println("  2 - Selection Sort");
        System.out.println("  3 - Insertion Sort");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.close();

        String algoritmoEscolhido;
        switch (opcao) {
            case 1: algoritmoEscolhido = "bubble";    break;
            case 2: algoritmoEscolhido = "selection"; break;
            case 3: algoritmoEscolhido = "insertion"; break;
            default:
                System.out.println("Opção inválida. Encerrando.");
                return;
        }

        String[][] files = {
            { "data/1000000_desordenado.txt",   "Desordenado  | 1.000.000"  },
        };

        NumberFileReader reader = new NumberFileReader();
        BubbleSort    bubble    = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();

        System.out.println("=".repeat(85));
        System.out.printf("%-30s %-14s %-16s %-12s %-16s%n",
                "Arquivo", "Algoritmo", "Comparações", "Trocas", "Tempo (ms)");
        System.out.println("=".repeat(85));

        for (String[] entry : files) {
            String filePath   = entry[0];
            String fileLabel  = entry[1];

            int[] numbers;
            try {
                numbers = reader.readNumbers(filePath);
            } catch (IOException e) {
                System.out.printf("%-30s  [ERRO ao ler arquivo: %s]%n", fileLabel, e.getMessage());
                System.out.println("-".repeat(85));
                continue;
            }

            int total = numbers.length;

            long start, elapsed;
            switch (algoritmoEscolhido) {
                case "bubble":
                    start = System.currentTimeMillis();
                    bubble.sort(numbers);
                    elapsed = System.currentTimeMillis() - start;
                    printResult(fileLabel, "Bubble Sort", total,
                            bubble.getComparisons(), bubble.getSwaps(), elapsed);
                    break;
                case "selection":
                    start = System.currentTimeMillis();
                    selection.sort(numbers);
                    elapsed = System.currentTimeMillis() - start;
                    printResult(fileLabel, "Selection Sort", total,
                            selection.getComparisons(), selection.getSwaps(), elapsed);
                    break;
                case "insertion":
                    start = System.currentTimeMillis();
                    insertion.sort(numbers);
                    elapsed = System.currentTimeMillis() - start;
                    printResult(fileLabel, "Insertion Sort", total,
                            insertion.getComparisons(), insertion.getSwaps(), elapsed);
                    break;
            }

            System.out.println("-".repeat(85));
        }
    }

    private static void printResult(String fileLabel, String algorithm,
                                    int total, long comparisons, long swaps, long elapsedMs) {
        System.out.printf("%-30s %-14s %,-16d %,-12d %,-16d%n",
                fileLabel, algorithm, comparisons, swaps, elapsedMs);
    }
}