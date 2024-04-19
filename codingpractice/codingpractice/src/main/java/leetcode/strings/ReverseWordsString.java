package leetcode.strings;

import java.util.Stack;

public class ReverseWordsString {

    public static void main(String[] args) {

        String str = "TUF is great for interview preparation";
        System.out.println("After reversing words: ");
        System.out.println(str.length());
        System.out.println(reverseWordsInString(str));
    }

    public static String reverseWordsInString(String s) {

        s += " ";
        System.out.println(s);
        System.out.println(s.length());

        Stack<String> st = new Stack<>();
        int i;
        String str = "";
        System.out.println(str.length());

        for(i = 0; i<s.length();i++){
            System.out.println(s.charAt(i));
            if(s.charAt(i) == ' '){
                st.push(str);
                str="";
            }else{
                str += s.charAt(i);
            }
        }

        String ans = "";
        System.out.println("Stack size: "+st.size());
        while (st.size() != 1){
            System.out.println("peek: "+st.peek());
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek(); //the last word shouldn't have a space after it

        return ans;
    }
}
