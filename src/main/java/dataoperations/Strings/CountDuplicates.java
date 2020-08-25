package dataoperations.Strings;

public class CountDuplicates {
    public static int duplicateCount(String text) {
        // Method count distinct case-insensitive alphabetic characters and numeric digits occurs more than one in input string.
        // Input String text
        // Output Integer -> count char which occurs more than one
        // Function take every character, and check if in other chars there is the same char
        // Two cases : Char is digit -> nothing
        // : Char is letter -> method make every letter to lowercase
        // Two loops -> First for whole string, second nested loop will check : if char is letter or digit, if no -> continue
        // Check if letter have the same letter in rest text, if yes -> count++
        // return count
        int count = 0;
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++){

            for(int j = i; j < text.length(); j ++) {
                if (!Character.isDigit(text.charAt(i)) && !Character.isLetter(text.charAt(i))) {
                    continue;
                }
                if (text.substring(i + 1, text.length()).contains(Character.toString(text.charAt(i)))) {
                    count++;
                    text = text.replace(Character.toString(text.charAt(i)), ".");
                }
            }
        }
        return count;
    }
}
