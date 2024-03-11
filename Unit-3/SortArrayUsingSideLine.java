import java.util.HashSet;

class SortArrayUsingSideLine{
    public static void main(String[] args){
        int[] trucks = {5,1,2,4,3};
        int expected = 1;

        HashSet<Integer> hash = new HashSet<>();

        for(int curr=0; curr<trucks.length; curr++){
            if(trucks[curr] == expected && !(hash.contains(trucks[curr]))){
                hash.add(trucks[curr]);
                expected++;
            }
            else{
                if( trucks[curr] >= hash.size() && !(hash.contains(trucks[curr]))){
                    hash.add(trucks[curr]);

                }
            }
        }

        for(Integer e : hash){
            System.out.println(e);
        }
    }
}