import java.util.Queue;
import java.util.LinkedList;

class UniqueGift{
    public static void main(String[] args){
        String str = "abadbc";

        char[] ch = str.toCharArray();
        Queue<Character> queue = new LinkedList<>();

        if(queue.isEmpty()){
            queue.offer(ch[0]);
        }

      int curr = 0;
        int expect = 1;

        while(expect < ch.length){
            if(ch[curr] != ch[expect]){
                queue.offer(ch[curr]);
                expect++;
            }
            else{
                queue.offer(ch[expect-1]);
                curr = expect-1;
                expect += 1;
            }
        }

        for(char c : queue){
            System.out.println(c);
        }

    }
}