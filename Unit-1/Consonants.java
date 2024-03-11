public class Consonants {
  public static void main(String[] args) {

    String str = "Samantha examined the letter and found it contained a hidden message.";
    char ch = '\0';
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i);
      if (!isVowel(ch) && Character.isLetter(ch)) {
        count++;
      }
    }
    System.out.println(count);
  }

  public static boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
        || ch == 'I' || ch == 'O' || ch == 'U';
  }
}
