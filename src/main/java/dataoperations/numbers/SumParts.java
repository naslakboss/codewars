package dataoperations.numbers;

import java.util.Arrays;

public class SumParts {

//    ls = [0, 1, 3, 6, 10]
//    ls = [1, 3, 6, 10]
//    ls = [3, 6, 10]
//    ls = [6, 10]
//    ls = [10]
//    ls = []

//    parts_sums(ls) -> [21, 20, 18, 15, 11, 6, 0]

    public static int[] sumParts(int[] ls) {
        int[] sum = new int[ls.length+1];
        sum[0] = Arrays.stream(ls).sum();

        for(int i = 1; i < sum.length; i++){
            sum[i] = sum[i-1] - ls[i -1];
        }

        return sum;
    }
}
