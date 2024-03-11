public class Prime {
    public static void main(String args[]){

        int num = 13;

    for (int i = 2; i <= num; i++) {

      if (num % i == 0 && num == 2) {
        System.out.println("Yes");
        return;

      } else if (num % i == 0 && num % 2 == 0) {
        System.out.println("No");
        return;
      }
      else if(num %i != 0 && (num%3 == 5 || num %5 == 3)){
        System.out.println("Yes");
        return;
      }
    
    }
    System.out.println("No");

    }
}
