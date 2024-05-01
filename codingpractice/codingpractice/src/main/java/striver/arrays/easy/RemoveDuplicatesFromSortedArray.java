package striver.arrays.easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,3,4,4};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] arr) {

        //Approach 1: Brute Force
//        Set<Integer> set = new HashSet<>();
//        for(int i=0;i<arr.length;i++) {
//            set.add(arr[i]);
//        }
//        return set.size();
        //End 1st Approach TC = O(N log N)
        //SC = O(N)

        //Optimised Approach : Two Pointer approach
        //1,1,2,2,3
        int i = 0;
        for(int j = 1; j<arr.length; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;

    }
}
