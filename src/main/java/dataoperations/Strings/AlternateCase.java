package dataoperations.Strings;

import java.util.stream.Collectors;

public class AlternateCase {
    public static String alternateCase(final String string) {
        char[] letter = string.toCharArray();
        String result = "";
        for(int i = 0; i < letter.length; i ++){
            if(Character.isLowerCase(letter[i])){
                letter[i] = Character.toUpperCase(letter[i]);
            }
            else if(Character.isUpperCase(letter[i])){
                letter[i] = Character.toLowerCase(letter[i]);
            }
             result += String.join("", Character.toString(letter[i]));
        }
        return result;
    }

    public String alternateCase2(String string){
        return string.chars()
                .mapToObj(c -> new Character((char) c))
                .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
                .map(c -> c.toString())
                .collect(Collectors.joining());
    }

}
