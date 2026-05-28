public class MatrizOperacoes {

    public boolean MatrizSimetrica(int[][] m, int i, int j) {
        if (i >= m.length) return true;
        if (j >= m.length) return MatrizSimetrica(m, i + 1, 0);
        if (m[i][j] != m[j][i]) return false;
        return MatrizSimetrica(m, i, j + 1);
    }

    public int[][] TransporMatriz(int[][] m, int i, int j) {
        if (i >= m.length) return m;
        if (j >= m.length) return TransporMatriz(m, i + 1, i + 2);
        int temp = m[i][j];
        m[i][j] = m[j][i];
        m[j][i] = temp;
        return TransporMatriz(m, i, j + 1);
    }
}