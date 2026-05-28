public class SomaIntervalo {
    public int SomaIntervalo(int n, int m) {
        if (n == m) return m;
        return n + SomaIntervalo(n + 1, m);
    }
}