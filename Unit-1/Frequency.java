import java.util.HashMap;
import java.util.Map;

public class Frequency {

    public static void findMostCommonWords(String text) {
        HashMap<String, Integer> hm = new HashMap<>();

        int count = 0;
        String max = "";

        for (String word : text.split(" ")) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            if (e.getValue() > count) {
                count = e.getValue();
                max = e.getKey();
            }
        }
        System.out.println(max + " - " + count);
    }

    public static void main(String[] args) {
        String text = "this is a sample text this text contains sample words sample words are used for testing";
        findMostCommonWords(text);
    }
}
