package leetcode.random;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] a = {4,3,2,5,6,1,4};
        System.out.println(secondLargestElement(a));
    }

    public static int secondLargestElement (int arr[]) {

        //1st brute force approach : TC: O (nlogn)
//        Arrays.sort(arr);
//        int n = arr.length-1;
//
//        int i = 0;
//        while(i<n){
//            if(arr[n] == arr[n-1-i]){
//                i++;
//            }else{
//                return arr[n-1-i];
//            }
//        }
//        return -1;

        //2nd Approach  TC: O(n)
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i]<largest && arr[i]>secondLargest ){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
