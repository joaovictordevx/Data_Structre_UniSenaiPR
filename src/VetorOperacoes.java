public class VetorOperacoes {

    public int SomaVetor(int[] v, int i) {
        if (i == v.length) return 0;
        return v[i] + SomaVetor(v, i + 1);
    }

    public int MaximoVetor(int[] v, int i) {
        if (i == v.length - 1) return v[i];
        return Math.max(v[i], MaximoVetor(v, i + 1));
    }

    public int MinimoVetor(int[] v, int i) {
        if (i == v.length - 1) return v[i];
        return Math.min(v[i], MinimoVetor(v, i + 1));
    }

    public double MediaVetor(int[] v) {
        return (double) SomaVetor(v, 0) / v.length;
    }
}