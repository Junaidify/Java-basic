import java.util.Arrays;

class SortGirl{
    public static void main(String[] args){
            int M = 4;
            int N = 5;
            int[] boys = {2,5,6,8};
            int[] girls = {3,8,5,1,7};

            Arrays.sort(boys);
            Arrays.sort(girls);

        String res = sortGirl(girls, boys, M, N);
            System.out.println(res);

    }
    public static String sortGirl(int[] girls, int[] boys, int M, int N){
        int count = 0;
        int j = 0;

        for(int i=0; i<M; i++){
            if(j < N && boys[i] > girls[j]){
                count++;
            }
            j++;
        }

        if(count == M){
            return "Yes";
        }
        return "No";
    }
}
