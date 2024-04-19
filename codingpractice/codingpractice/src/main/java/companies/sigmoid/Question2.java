package companies.sigmoid;

import java.util.HashSet;

public class Question2 {

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");

        HashSet<String> set2 = new HashSet<>();
        set2.add("cherry");
        set2.add("date");

        System.out.println("Set1: "+set1);
        System.out.println("Set2: "+set2);

        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set1.size());
    }
}
