import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Exercícios de Recursão ===");
        System.out.println("-- Matemática --");
        System.out.println("  1. Fatorial       (n)");
        System.out.println("  2. Soma 1..n      (n)");
        System.out.println("  3. Fibonacci      (n)");
        System.out.println("  4. Potência       (x, y)");
        System.out.println("  8. Multiplicação  (x, y)");
        System.out.println("  9. Soma intervalo (n, m)");
        System.out.println("-- Strings --");
        System.out.println("  6. Palíndromo     (palavra)");
        System.out.println("  7. Inversão       (palavra)");
        System.out.println("-- Vetores & Matrizes --");
        System.out.println("  5. Contagem regressiva (n)");
        System.out.println(" 10. Ordem crescente    (n)");
        System.out.println(" 11. Vetor 10 elementos");
        System.out.println(" 12. Matriz 3x3");
        System.out.println("==============================");
        System.out.print("Digite o exercício: ");
        int req = sc.nextInt();

        switch (req) {
            case 1:
                System.out.println("Calcula o fatorial de n: n! = n * (n-1) * ... * 1  (ex: 5! = 120)");
                Fatorial fatorial = new Fatorial();
                System.out.print("Digite n: ");
                System.out.println(fatorial.Fatorial(sc.nextInt()));
                break;

            case 2:
                System.out.println("Soma todos os inteiros de 1 até n  (ex: n=4 → 1+2+3+4 = 10)");
                Soma soma = new Soma();
                System.out.print("Digite n: ");
                System.out.println(soma.Soma(sc.nextInt()));
                break;

            case 3:
                System.out.println("Retorna o n-ésimo termo da sequência de Fibonacci  (ex: n=7 → 13)");
                Fibonacci fibonacci = new Fibonacci();
                System.out.print("Digite n: ");
                System.out.println(fibonacci.Fibonacci(sc.nextInt()));
                break;

            case 4:
                System.out.println("Calcula x elevado à potência y  (ex: x=2, y=8 → 256)");
                Potencia potencia = new Potencia();
                System.out.print("Digite x e y: ");
                System.out.println(potencia.Potencia(sc.nextInt(), sc.nextInt()));
                break;

            case 5:
                System.out.println("Imprime a contagem regressiva de n até 0  (ex: n=5 → 5 4 3 2 1 0)");
                CountRegressiva contagem = new CountRegressiva();
                System.out.print("Digite n: ");
                contagem.CountRegressiva(sc.nextInt());
                System.out.println();
                break;

            case 6:
                System.out.println("Verifica se a palavra é um palíndromo, ou seja, se é igual de trás para frente  (ex: \"arara\" → true)");
                Palindromo palindromo = new Palindromo();
                System.out.print("Digite a palavra: ");
                String palavra = sc.next();
                System.out.println(palindromo.Palindromo(palavra, 0, palavra.length() - 1));
                break;

            case 7:
                System.out.println("Inverte os caracteres de uma palavra  (ex: \"java\" → \"avaj\")");
                InversaoString inversao = new InversaoString();
                System.out.print("Digite a palavra: ");
                System.out.println(inversao.InversaoString(sc.next()));
                break;

            case 8:
                System.out.println("Multiplica x por y usando apenas somas repetidas  (ex: x=3, y=4 → 12)");
                Multiplicacao multi = new Multiplicacao();
                System.out.print("Digite x e y: ");
                System.out.println(multi.Multiplicacao(sc.nextInt(), sc.nextInt()));
                break;

            case 9:
                System.out.println("Soma todos os inteiros entre n e m inclusive  (ex: n=3, m=6 → 3+4+5+6 = 18)");
                SomaIntervalo somaIntervalo = new SomaIntervalo();
                System.out.print("Digite n e m: ");
                System.out.println(somaIntervalo.SomaIntervalo(sc.nextInt(), sc.nextInt()));
                break;

            case 10:
                System.out.println("Imprime os números de 0 até n em ordem crescente  (ex: n=4 → 0 1 2 3 4)");
                OrdemCrescente ordem = new OrdemCrescente();
                System.out.print("Digite n: ");
                ordem.OrdemCrescente(0, sc.nextInt());
                System.out.println();
                break;

            case 11:
                System.out.println("Recebe 10 números e calcula: soma, maior, menor e média do vetor");
                VetorOperacoes vetor = new VetorOperacoes();
                System.out.print("Digite os 10 elementos do vetor: ");
                int[] v = new int[10];
                for (int i = 0; i < 10; i++) v[i] = sc.nextInt();
                System.out.println("Soma   : " + vetor.SomaVetor(v, 0));
                System.out.println("Máximo : " + vetor.MaximoVetor(v, 0));
                System.out.println("Mínimo : " + vetor.MinimoVetor(v, 0));
                System.out.println("Média  : " + vetor.MediaVetor(v));
                break;

            case 12:
                System.out.println("Recebe uma matriz 3x3 e verifica se é simétrica (m[i][j] == m[j][i]) e exibe sua transposta");
                MatrizOperacoes matriz = new MatrizOperacoes();
                System.out.print("Digite os 9 elementos da matriz 3x3: ");
                int[][] m = new int[3][3];
                for (int i = 0; i < 3; i++)
                    for (int j = 0; j < 3; j++)
                        m[i][j] = sc.nextInt();
                System.out.println("Simétrica: " + matriz.MatrizSimetrica(m, 0, 0));
                int[][] transposta = matriz.TransporMatriz(m, 0, 1);
                System.out.println("Transposta:");
                for (int[] linha : transposta) {
                    for (int val : linha) System.out.printf("%3d", val);
                    System.out.println();
                }
                break;
                
            default:
                System.out.println("Opção inválida.");
                break;
        }

        sc.close();
    }
}