class findSubSequence {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {3, 34, 4, 12, 5, 2}; //  arr = {1,2,3,6,9} , arr = {1,2,3,4,5,6,7,8,9}
        int sum = 9;  // sum = 16 , sum = 5

        boolean result = findSum(arr, n, sum);
        if(result){
          System.out.println("yes"); 
        }
        else{
          System.out.println("no");
        }
    }
 
    public static boolean findSum(int[] arr, int n, int sum){
        if(n == 0 || sum < 0){
            return false; 
        }
        
        if(sum == 0 ){
            return true; 
        }
        
        if(arr[n-1] < sum){
            return findSum(arr, n-1, sum-arr[n-1]) || findSum(arr, n-1, sum); 
        }
        else if(arr[n-1]== sum){
            return findSum(arr, n, sum-arr[n-1]);
        }
        else{
            return findSum(arr, n-1, sum);
        }
    }
    
}

