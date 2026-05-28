public class Multiplicacao {
    public int Multiplicacao(int x, int y) {
        if (y == 0) return 0;
        return x + Multiplicacao(x, y - 1);
    }
}