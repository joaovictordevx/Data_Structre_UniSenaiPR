public class OrdemCrescente {
    public void OrdemCrescente(int atual, int n) {
        if (atual > n) return;
        System.out.print(atual + " ");
        OrdemCrescente(atual + 1, n);
    }
}