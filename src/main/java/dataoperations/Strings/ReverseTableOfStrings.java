package dataoperations.Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseTableOfStrings {
    //    ""Begin on Lua Pkwy", "Right on Sixth Alley", "Right on 1st Cr""
    // Right on 1st Cr Right on Sixth Alley Begin on Lua Pkwy

    public static String[] solve(String[] arr) {
        List<String> toReverse = Arrays.asList(arr);
        Collections.reverse(toReverse);
        String[] reversed = toReverse.toArray(arr);
        for(int i = 0; i < reversed.length; i++){
            System.out.println(reversed);
        }
        String[] firstDest = reversed[0].split(" ");
        String[] lastDest = reversed[reversed.length-1].split(" ");

        String handle = "";
        handle = lastDest[0];
        lastDest[0] = firstDest[0];
        firstDest[0] = handle;
        reversed[0].split("");
        for(int i = 0; i < reversed.length; i++){
            String[] handler = reversed[i].split(" ");
            String hand = "";
            hand = handler[0];
        }







        return reversed;
    }
}
