public class CountRegressiva {
    public void CountRegressiva(int n) {
        if (n < 0) return;
        System.out.print(n + " ");
        CountRegressiva(n - 1);
    }
}