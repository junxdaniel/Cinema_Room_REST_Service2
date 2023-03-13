import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next();
        String word2 = scanner.next();

        HashMap<Character, Integer> map1 = anagram(word1);
        HashMap<Character, Integer> map2 = anagram(word2);
        /**
        map1.forEach((ch, value) -> System.out.println(ch + "=" + value));
        map2.forEach((ch, value) -> System.out.println(ch + "=" + value));
        */
        System.out.println((map1.equals(map2)) ? "yes" : "no");
    }

    public static HashMap<Character, Integer> anagram(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        Character ch;

        for (int i = 0; i < word.length(); i++) {
            ch = Character.toLowerCase(word.charAt(i));
            map.put(ch, map.compute(ch, (k, v) -> (v == null) ? 1 : v + 1));
        }
        return map;
    }
}