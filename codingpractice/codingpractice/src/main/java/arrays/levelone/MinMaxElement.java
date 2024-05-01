package arrays.levelone;

import java.util.Arrays;

public class MinMaxElement {

    public static void main(String[] args) {

        int arr[] = {3,4,1};
        minMaxElement(arr, arr.length);
    }

    public static void minMaxElement(int[] arr, int n){

        //Solution 1:
//        Arrays.sort(arr);
//        System.out.println("Min Element: "+arr[0]);
//        System.out.println("Max Elemrnt: "+arr[n-1]);

        //Solution 2:
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i]> max) {
                max = arr[i];
            }

        }
        System.out.println("Min Element: "+min);
        System.out.println("Max Element: "+max);
    }
}
