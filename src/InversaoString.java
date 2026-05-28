public class InversaoString {
    public String InversaoString(String s) {
        if (s.isEmpty()) return s;
        return InversaoString(s.substring(1)) + s.charAt(0);
    }
}