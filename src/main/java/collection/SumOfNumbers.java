package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(1);
        ar.add(3);
        ar.add(5);
        ar.add(5);
        ar.add(4);
        ar.add(1);
        ar.add(10);
        ar.add(3);

        ArrayList<List<Integer>> result = new ArrayList<>();

        Integer[] input = new Integer[ar.size()];
        input = ar.toArray(input);
        Arrays.sort(input);

        for ( Integer d : input) {
            System.out.print(d + " ");

        }

        System.out.println("");

        int sum = 10;
        for (int i = 0; i < input.length; i++) {

            if (i > 0 && input[i] == input[i-1]) {
                continue;
            }

            for (int j = i + 1; j < input.length; j++) {

                if ( j > i + 1 && input[j] == input[j-1]) {
                    continue;
                }
                //[[1, 4, 5], [2, 3, 5], [2, 3, 5], [3, 3, 4]]
                for (int k = j + 1; k < ar.size(); k++) {

                    if ( k > j + 1 && input[k] == input[k-1]) {
                        continue;
                    }

                    if (input[i] + input[j] + input[k] == sum) {
                        result.add(Arrays.asList(input[i],input[j],input[k]));
                    }
                }
            }

        }

        System.out.println(result);
    }
}
