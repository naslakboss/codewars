package dataoperations.Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    // Method reverse word if it contains more than 5 letters
    public static String spinWords(String sentence) {

        String[] words = sentence.split(" ");

        String result = "";
        for (int i = 0; i < words.length; i++) {
            String reversed = "";

            if (words[i].length() >= 5) {
                char[] chars = words[i].toCharArray();
                for (int j = chars.length - 1; j >= 0; j--) {
                    reversed = reversed.concat(String.valueOf(chars[j]));
                }
                if (i == words.length - 1) {
                    result += reversed;
                } else {
                    result += reversed + " ";
                }
            } else {
                if (i == words.length - 1) {
                    return result += words[i];
                } else result += words[i] + " ";
            }
        }
        return result;
    }

    public static String spinWords2(String sentence) {
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            if(words[i].length() > 5){
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" " + words);
    }

    public static String spinWords3(String sentence){
        String[] words = sentence.split(" ");
        return Arrays.stream(words)
                .map(i-> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining());
    }
}
