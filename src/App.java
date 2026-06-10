import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("  1 - Bubble Sort");
        System.out.println("  2 - Selection Sort");
        System.out.println("  3 - Insertion Sort");
        System.out.println("  4 - Merge Sort");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.close();

        String algoritmoEscolhido;
        switch (opcao) {
            case 1: algoritmoEscolhido = "bubble";    break;
            case 2: algoritmoEscolhido = "selection"; break;
            case 3: algoritmoEscolhido = "insertion"; break;
            case 4: algoritmoEscolhido = "merge";     break;
            default:
                System.out.println("Opção inválida. Encerrando.");
                return;
        }

        String[][] files = {
            { "data/10000_desordenado.txt",    "Desordenado  | 10.000"    },
            { "data/10000_inverso.txt",        "Inverso      | 10.000"    },
            { "data/10000_ordenado.txt",       "Ordenado     | 10.000"    },
            { "data/100000_desordenado.txt",   "Desordenado  | 100.000"   },
            { "data/100000_inverso.txt",       "Inverso      | 100.000"   },
            { "data/100000_ordenado.txt",      "Ordenado     | 100.000"   },
            { "data/500000_desordenado.txt",   "Desordenado  | 500.000"   },
            { "data/500000_inverso.txt",       "Inverso      | 500.000"   },
            { "data/500000_ordenado.txt",      "Ordenado     | 500.000"   },
            { "data/1000000_desordenado.txt",  "Desordenado  | 1.000.000" },
            { "data/1000000_inverso.txt",      "Inverso      | 1.000.000" },
            { "data/1000000_ordenado.txt",     "Ordenado     | 1.000.000" },
        };

        NumberFileReader reader    = new NumberFileReader();
        BubbleSort       bubble    = new BubbleSort();
        SelectionSort    selection = new SelectionSort();
        InsertionSort    insertion = new InsertionSort();
        MergeSort        merge     = new MergeSort();

        System.out.println("=".repeat(85));
        System.out.printf("%-30s %-14s %-16s %-12s %-16s%n",
                "Arquivo", "Algoritmo", "Comparações", "Trocas", "Tempo (ms)");
        System.out.println("=".repeat(85));

        for (String[] entry : files) {
            String filePath  = entry[0];
            String fileLabel = entry[1];

            int[] numbers;
            try {
                numbers = reader.readNumbers(filePath);
            } catch (IOException e) {
                System.out.printf("%-30s  [ERRO ao ler arquivo: %s]%n", fileLabel, e.getMessage());
                System.out.println("-".repeat(85));
                continue;
            }

            long start, elapsed;
            switch (algoritmoEscolhido) {
                case "bubble":
                    start = System.currentTimeMillis();
                    bubble.sort(numbers);
                    elapsed = System.currentTimeMillis() - start;
                    printResult(fileLabel, "Bubble Sort",
                            bubble.getComparisons(), bubble.getSwaps(), elapsed);
                    break;

                case "selection":
                    start = System.currentTimeMillis();
                    selection.sort(numbers);
                    elapsed = System.currentTimeMillis() - start;
                    printResult(fileLabel, "Selection Sort",
                            selection.getComparisons(), selection.getSwaps(), elapsed);
                    break;

                case "insertion":
                    start = System.currentTimeMillis();
                    insertion.sort(numbers);
                    elapsed = System.currentTimeMillis() - start;
                    printResult(fileLabel, "Insertion Sort",
                            insertion.getComparisons(), insertion.getSwaps(), elapsed);
                    break;

                case "merge":
                    start = System.currentTimeMillis();
                    merge.sort(numbers);
                    elapsed = System.currentTimeMillis() - start;
                    printResult(fileLabel, "Merge Sort",
                            merge.getComparisons(), merge.getSwaps(), elapsed);
                    break;
            }

            System.out.println("-".repeat(85));
        }
    }

    private static void printResult(String fileLabel, String algorithm,
                                    long comparisons, long swaps, long elapsedMs) {
        System.out.printf("%-30s %-14s %,-16d %,-12d %,-16d%n",
                fileLabel, algorithm, comparisons, swaps, elapsedMs);
    }
}