import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Problema1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        in.close();

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        Map<Character, Integer> p1 = getCharCount(s1);
        Map<Character, Integer> p2 = getCharCount(s2);

        boolean isAnagram = true;

        for (Entry<Character, Integer> e : p1.entrySet()) {

            Integer count = p2.get(e.getKey());

            if (count == null || !count.equals(e.getValue())) {
                isAnagram = false;
            }
        }

        System.out.println(isAnagram);

    }

    public static Map<Character, Integer> getCharCount(String str) {
        Map<Character, Integer> p = new HashMap<>();

        for( int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            Integer count = p.get(c);

            if(count == null) {
                count = 0;
            }
            p.put(c, c + 1);
        }

        return p;
    }
}