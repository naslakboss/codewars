package dataoperations.numbers;

import java.util.Arrays;

public class MaximumSubarraySum {
    public static int sequence(int[] array){

        //Method search for highest sum of sub-array of integers.
        // Easy case -> Every integer in array is positive -> max sum is sum of whole array
        // If array/list contains only negative numbers -> return 0
        // if greatest sum = 0 -> list is empty
        // STEPS:
        // Iterate through array.
        // if every digit is + -> just add every arg
        // if sum = 0 -> list is empty
        // hard case -> Array contains positive and negative number.
        // Method need to check which subarray have biggest sum
        // How to check which subarray have biggest sum ?
        // example : tab[-2, 1, -4, 3]
        if(array.length == 0){
            return 0;
        }
        int biggest = array[0];
        int sum = 0;
        for(int i = 0; i < array.length; i ++){
            for(int j = i; j < array.length; j++){
                sum += array[j];
                if(sum > biggest) {
                    biggest = sum;
                }
            }
            sum = 0;
        }

        if(biggest < 0){
            return 0;
        }
        return biggest;
    }

    public static int sequence2(int[] array){
        final int[] max = {0};
        return Arrays.stream(array).map(x -> x = max[0]= x + max[0] > 0 ? max[0] + x : 0).max().orElse(0);
    }
}
