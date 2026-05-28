public class Palindromo {
    public static boolean Palindromo(String s, int inicio, int fim) {
        if (inicio >= fim) return true;
        if (s.charAt(inicio) != s.charAt(fim)) return false;
        return Palindromo(s, inicio + 1, fim - 1);
    }
}
