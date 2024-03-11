public class AddVowelSb {
    public static void main(String[] args) {
        String[] stringArray = { "Hello World I am learning Java" };

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < stringArray.length; i++) {
            char[] ch = stringArray[i].toCharArray();

            for (char cha : ch) {
                if (isVowel(cha)) {
                    sb.append(cha);

                }
            }
        }
        System.out.print(sb);

    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'
                || c == 'I' || c == 'O' || c == 'U';
    }
}
