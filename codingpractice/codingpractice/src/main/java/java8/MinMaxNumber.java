package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,45,88,1,3,9);

        int max= numbers.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(max);

        int min = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(min);

    }
}
