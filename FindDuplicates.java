package leetcode.random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};

        System.out.println("Arr: "+ Arrays.toString(findDuplicates(arr)));
    }

    public static int[] findDuplicates(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int count=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                count++;
            }
        }

        int arr[] = new int[count];
        int i=0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                arr[i++] = entry.getKey();
            }
        }

        return arr;
    }
}
