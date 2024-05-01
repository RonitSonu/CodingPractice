package striver.arrays.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestElement {


    public static void main(String[] args) {

        int[] arr = {2,1,3,5,4,2};
        System.out.println(secondLargestElement(arr));

    }

    public static int secondLargestElement(int[] arr){

        //First Approach TC: O(n log n)
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int n = arr.length;
//        for(int i=n-2; i>=0; i--){
//            if(arr[i] < arr[i+1]){
//                return arr[i];
//            }
//        }
//        return -1;

//        Striver Approach
//        Arrays.sort(arr);
//        int n = arr.length;
//        int largest = arr[n-1];
//        int secondLargest = Integer.MIN_VALUE;
//        for(int i=n-2; i>=0; i--){
//            if(arr[i] != largest){
//                secondLargest = arr[i];
//                break;
//            }
//        }
//        return secondLargest;
        //End 1st approach

        //2nd Approach 2,1,3,5,4,2
//        int n = arr.length;
//        int largest = arr[0];
//        int secondLargest = Integer.MIN_VALUE;
//        for(int i=1;i<n;i++){
//            if(arr[i] > largest){
//                largest = arr[i];
//            }
//        }
//        //System.out.println("Largest "+ largest);
//
//        for(int i=0;i<n;i++){
//            if(arr[i]>secondLargest && arr[i] != largest ) {
//                secondLargest = arr[i];;
//            }
//        }
//
//        return secondLargest;
        //2nd Approach end TC= O(2N)

        //Optimal Approach TC= O(N)
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<n;i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
                
            }
        }
        return secondLargest;
        //End Optimal
    }
}
