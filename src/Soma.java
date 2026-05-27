public class Soma {
    public int Soma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + Soma(n - 1);
        }
    }
}
