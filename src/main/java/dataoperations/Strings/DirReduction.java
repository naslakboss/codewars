package dataoperations.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduction(String[] direction) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < direction.length ; i++){
            builder.append(direction[i] +".");
            System.out.println(builder);
        }



        return new String[]{};
    }
}
//    public static String[] dirReduction2(String[] direction) {
//
//}
