import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Collections.min;

@FunctionalInterface
public interface Assignment3 {
    public abstract void calculator();
}

class Calculation {
    public static void main(String[] args) {
        Assignment3 multiply = () -> {
            List<Integer> list1 = Arrays.asList(1, 2);
            List<Integer> list2 = Arrays.asList(1, 2);

            Integer[] intArray1 = new Integer[list1.size()];
            intArray1 = list1.toArray(intArray1);
            Integer[] intArray2 = new Integer[list2.size()];
            intArray2 = list1.toArray(intArray2);
            String result = "";
            for (int i = 0; i < intArray1.length; i++) {
                int num1 = intArray1[i];
                int num2 = intArray2[i];


                result += Integer.toString(num1 * num2) + " ";
            }

            System.out.println(result);


            List<Integer> listresult = list1.stream()
                    .flatMap(s1 -> list2.stream().map(s2 -> s1 * s2))

                    .collect(Collectors.toList());
            System.out.println(listresult);
        };
        multiply.calculator();
    }
}