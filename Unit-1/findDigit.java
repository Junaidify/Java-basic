public class findDigit {
    public static void main(String[] args) {
        int N = 97420;
        int num = 420;
        String findNum = Integer.toString(num);
        String givenNum = Integer.toString(N);
        
        if(givenNum.contains(findNum)){
            System.out.println("Caught");
        }
        else{
            System.out.println("Escaped");
        }
    }
}
