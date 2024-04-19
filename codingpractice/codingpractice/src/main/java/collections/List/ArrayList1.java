package collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {

        List<Integer> arraylist = new ArrayList<>();

        arraylist.add(1);
        arraylist.add(3);
        arraylist.add(6);

        System.out.println(arraylist.size());

        System.out.println(arraylist.isEmpty());

        System.out.println(arraylist.contains(1));




        System.out.println(arraylist);
        arraylist.remove(1);

        Integer[] arr = arraylist.toArray(new Integer[arraylist.size()]);
        System.out.println(Arrays.asList(arr));


        System.out.println(arraylist.indexOf(6));
        arraylist.add(1);
        System.out.println(arraylist.lastIndexOf(1));
    }
}
