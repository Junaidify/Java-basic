public class subString {
    public static void main(String[] args) {

        String name = "aman";

        System.out.println("All substrings of \"" + name + "\":");

        for (int i = 0; i < name.length(); i++) {

            for (int j = i + 1; j <= name.length(); j++) {

                String substring = name.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}
