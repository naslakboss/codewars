package dataoperations.bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BitCounting {

    public static int bitCounts(int n){
        //Return number of bits
        //that are equal to
        // one in the representation of that number
        // What method do?
        // Take decimal, convert into binary and count '1';

        // Method steps
        //1. Convert decimal into binary
        //2. Iterate through binary and count 1

        // Tools
        // Conversion from decimal to binary -> any utils?
        // Iterate through binary and count 1 ->
        // Loop, Enchanced Loop and Stream -> Write in every case

        //Ad.1 Conversion decimal to binary
        // Example:
        // n = 23
        // Calculations : 23/2 = 11 r1 -> 1 : (11,1)
        //11/2 = 5 r2 -> 1 : (5,1)
        // 5/2 = 2 r3 ->1 : (2,1)
        // 2/2 = 1 r4 -> 0 : (1,0)
        // 1/2 = 0 r5 -> 1 : (0,1) 23DEC = 11101 BIN AND REVERSE ORDER -> 23 DEC = 10111 BIN

        List<Integer> binary = new ArrayList<>();
        while(n > 0){
            if(n%2 == 0){
                binary.add(0);
            }
            else if(n%2 == 1){
                binary.add(1);
            }
            n = n/2;
        }

        int count = 0;
        Collections.reverse(binary);
        for(Integer digit : binary){
            if(digit == 1){
                count ++;
            }
        }
        String result = binary.stream().map(x -> Integer.toString(x)).collect(Collectors.joining());
        System.out.println(result);
        System.out.println(count);
        return count;
    }

    public static int countBit2(int n){
        List<Integer> binary = new ArrayList<>();
        int count = 0;
        while(n > 0){
            if(n%2 == 0){
                binary.add(0);
            }
            else if(n%2 == 1){
                binary.add(1);
                count ++;
            }
            n = n/2;
        }
        return count;
    }

    public static int countBit3(int n){
        return Integer.bitCount(n);
    }
}
