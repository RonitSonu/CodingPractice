package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem2 {

    public static void main(String[] args) {

        //Write a java program to find the second largest integer in a list of integers
        List<Integer> listOfInteger = Arrays.asList(45,12,31,44,67,21,98);

       int ans =  listOfInteger.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(ans);

    }
}
