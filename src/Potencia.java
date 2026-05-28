public class Potencia {
    public double Potencia(double x, int y) {
        if (y == 0) return 1;
        return x * Potencia(x, y - 1);
    }
}
