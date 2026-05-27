// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// public class GenerateData {

//     private static final int[] SIZES = {10_000, 100_000, 500_000, 1_000_000};
//     private static final String OUTPUT_DIR = "data";

//     public static void main(String[] args) throws IOException {
//         Files.createDirectories(Paths.get(OUTPUT_DIR));

//         for (int size : SIZES) {
//             List<Integer> base = new ArrayList<>(size);
//             for (int i = 1; i <= size; i++) {
//                 base.add(i);
//             }

//             // Ordenado
//             writeFile(size + "ordenado_txt", base);

//             // Invertido
//             List<Integer> invertido = new ArrayList<>(base);
//             Collections.reverse(invertido);
//             writeFile(size + "invertido_.txt", invertido);

//             // Desordenado
//             List<Integer> desordenado = new ArrayList<>(base);
//             Collections.shuffle(desordenado);
//             writeFile(size +"desordenado_.txt", desordenado);
//         }

//         System.out.println("\nTodos os arquivos foram gerados com sucesso!");
//     }

//     private static void writeFile(String filename, List<Integer> numbers) throws IOException {
//         String path = OUTPUT_DIR + "/" + filename;

//         try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
//             for (int i = 0; i < numbers.size(); i++) {
//                 if (i > 0) bw.write(",");
//                 bw.write(String.valueOf(numbers.get(i)));
//             }
//         }

//         System.out.printf("  Gerado: %s  (%,d números)%n", path, numbers.size());
//     }
// }