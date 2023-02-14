import java.util.Arrays;

public class isAnagram {
    public static boolean isAnagram(String s, String t) {
        s.toLowerCase();
        t.toLowerCase();
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        if (a.length != b.length) {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("Cat", "Tac"));
    }
}
