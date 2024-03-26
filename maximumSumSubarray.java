package leetcode.slidingwindow;

public class maximumSumSubarray {

    public static void main(String[] args) {
        int[] arr = {2,1,3,2,3,5};
        int k = 3;
        System.out.println(maximumSumSubArray(arr,k));
    }

    public static int maximumSumSubArray(int[] arr, int k){

        int i=0,j=0;
        int sum = 0;

        int len = arr.length;
        int max = Integer.MIN_VALUE;
        while(j<len){
            sum = sum + arr[j];
            if(j-i+1 < k){
                j++;
            } else if (j-i+1 == k) {
                if(max<sum){
                    max = sum;
                }
                sum = sum - arr[i];
                i++;
                j++;

            }

        }
        return max;
    }
}
