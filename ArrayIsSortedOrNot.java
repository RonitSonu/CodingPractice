package leetcode.random;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,4,3,4,5};
        System.out.println(isArraySorted(arr));

    }
    public static boolean isArraySorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i] >= arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }
}
