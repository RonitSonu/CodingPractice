package arrays.levelone;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        String str = "Word";
        System.out.println("The reversed string is: "+reverseWord(str));

        //Reverse Char Array in in-place :
        /**
         * Write a function that reverses a string. The input string is given as an array of characters s.
         *
         * You must do this by modifying the input array in-place with O(1) extra memory.
         *
         *
         *
         * Example 1:
         *
         * Input: s = ["h","e","l","l","o"]
         * Output: ["o","l","l","e","h"]
         * Example 2:
         *
         * Input: s = ["H","a","n","n","a","h"]
         * Output: ["h","a","n","n","a","H"]
         *
         *
         * Constraints:
         *
         * 1 <= s.length <= 105
         * s[i] is a printable ascii character.
         * */
        char[] chArr = {'h','e','l','l','o'};
        reverseCharacterArray(chArr);



    }

    public static String reverseWord(String s) {

        char[] charArr = s.toCharArray();
        String reversedWord = "";
        for(int i=s.length()-1;i>=0;i--){
            reversedWord = reversedWord + charArr[i];
        }
        return reversedWord;
    }

    //For char Array
    public static void reverseCharacterArray(char[] s) {

        char tempChar;

        for(int i = 0,j = s.length-1; i<j; i++,j--){
            tempChar = s[i];
            s[i] = s[j];
            s[j] = tempChar;
        }


        System.out.println("The reversed Char array: "+ Arrays.toString(s));
    }
}
