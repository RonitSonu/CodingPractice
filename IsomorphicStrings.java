package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "doe";
        System.out.println(isIsomorphic(s1,s2));

    }

    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> characterMap = new HashMap<>();

        for (int i=0;i<s.length();i++){

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!characterMap.containsKey(original)){
                if (!characterMap.containsValue(replacement)){
                    characterMap.put(original, replacement);
                } else {
                    return false;
                }
            } else {
                char mappedCharacter = characterMap.get(original);
                if(mappedCharacter != replacement){
                    return false;
                }
            }
        }
        return true;
    }
}
