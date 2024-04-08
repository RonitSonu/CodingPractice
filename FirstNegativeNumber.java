package leetcode.slidingwindow;

import org.springframework.boot.actuate.endpoint.web.Link;

import java.util.*;

public class FirstNegativeNumber {

    //Queue approach:
    public static void main(String[] args) {

        int[] arr = {12,-2,4,8,6,30,0,-28};

        int k = 3;
        int size = arr.length;
        int i=0,j=0;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();


        while(j<size){

            if(arr[j] < 0){
                queue.add(arr[j]);
            }

            if((j-i+1) < k){
                j++;
            } else if ((j-i+1) == k) {

                if(queue.isEmpty()){
                    list.add(0);
                }else{
                    list.add(queue.peek());
                    if(arr[i] == queue.peek()){
                        queue.poll();
                    }

                }
                    i++;

                j++;

            }

        }

        System.out.println("List: "+list);

    }
}
