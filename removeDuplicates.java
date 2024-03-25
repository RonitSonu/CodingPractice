package leetcode.random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class removeDuplicates {

    public static void main(String[] args) {
        int arr[] = {3,22,3,3,1,2,3};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    public static int[] removeDuplicates (int[] arr){

        //Brute Force Approach TC: O (nlogn)
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);
        }
        System.out.println(set);

       int[] a = new int[set.size()];
       int i=0;
       Integer[] array = new Integer[set.size()];
       for(Integer value: set){
           a[i++] = value;
       }
       return a;

        //Optimal Approach: Two pointers  Retrurns the count of the unique elements
//        int i = 0;
//        for(int j=1;j<arr.length;j++){
//            if(arr[j] != arr[i]){
//                arr[i+1] = arr[j];
//                i++;
//            }
//        }
//
//        return i+1;

    }
}
