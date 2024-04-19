package leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllAnagramsInAString {
    public static void main(String[] args) {

        String s = "aabaabaa";
        String p = "aaba";
        int k = p.length();

        List<Integer> ans = new ArrayList<>();


        HashMap<Character,Integer> map = new HashMap<>();

        //Creating a map to store the count of characters of p
        for(int i=0; i<k; i++){
            char ch = p.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        System.out.println(map);

        int count = map.size();
        int i=0,j=0;

        while(j<s.length()){
            //Calculation
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);

                if(map.get(ch)==0){
                    count--;
                }
            }

            if(j-i+1 < k ){
                j++;
            } else{
                if(count == 0){
                    ans.add(i);
                }
                char ch1 = s.charAt(i);
                if(map.containsKey(ch1)){
                    map.put(ch1,map.get(ch1)+1);
                    if(map.get(ch1)==1){
                        count++;
                    }
                }
                i++;
                j++;


            }
        }
        System.out.println("Ans: "+ans);

    }
}
