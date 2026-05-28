import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o exercício: ");
        int req = sc.nextInt();

        switch (req) {
            case 1:
                Fatorial fatorial = new Fatorial();
                System.out.print("Digite n: ");
                System.out.println(fatorial.Fatorial(sc.nextInt()));
                break;

            case 2:
                Soma soma = new Soma();
                System.out.print("Digite n: ");
                System.out.println(soma.Soma(sc.nextInt()));
                break;

            case 3:
                Fibonacci fibonacci = new Fibonacci();
                System.out.print("Digite n: ");
                System.out.println(fibonacci.Fibonacci(sc.nextInt()));
                break;

            case 4:
                Potencia potencia = new Potencia();
                System.out.print("Digite x e y: ");
                System.out.println(potencia.Potencia(sc.nextInt(), sc.nextInt()));
                break;

            case 5:
                CountRegressiva contagem = new CountRegressiva();
                System.out.print("Digite n: ");
                contagem.CountRegressiva(sc.nextInt());
                break;

            case 6:
                Palindromo palindromo = new Palindromo();
                System.out.print("Digite a palavra: ");
                String palavra = sc.next();
                System.out.println(palindromo.Palindromo(palavra, 1, palavra.length()));
                break;
                
            case 7:
                InversaoString inversao = new InversaoString();
                System.out.print("Digite a palavra: ");
                System.out.println(inversao.InversaoString(sc.next()));
                break;

            case 8:
                Multiplicacao multi = new Multiplicacao();
                System.out.print("Digite x e y: ");
                System.out.println(multi.Multiplicacao(sc.nextInt(), sc.nextInt()));
                break;

            case 9:
                SomaIntervalo somaIntervalo = new SomaIntervalo();
                System.out.print("Digite n e m: ");
                System.out.println(somaIntervalo.SomaIntervalo(sc.nextInt(), sc.nextInt()));
                break;

            case 10:
                OrdemCrescente ordem = new OrdemCrescente();
                System.out.print("Digite n: ");
                ordem.OrdemCrescente(0, sc.nextInt());
                break;

            case 11:
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