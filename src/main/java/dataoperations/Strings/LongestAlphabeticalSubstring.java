package dataoperations.Strings;

public class LongestAlphabeticalSubstring {
    public static String longestAlphabeticalSubstring(String text) {
        // Method take String -> array of joined characters
        // Method find the longest alphabetical substring
        // 1. Method need to iterate through whole String
        // WAYS : Iterator or Stream
        // 2. If alphabetical order in consecutive order is preserved, method add +1 to counter
        // ( Method compare letter  only itself to letter before)
        // To compare chars i can use < == > due to UNICODE
        // Method also store order in array of chars bcs its return it finally
        // 3. If consecutive order is not preserved, method remain old counter and start to count
        // another suitable substring -> second order need to be created, and check after every iterate
        // Method deleted iterated fragment and start with rest to check if there
        // if secondCounter is not bigger than old. Second counter also has second array with their letters
        // Every iteration has element of comparing
        // If every letter neighboring letters are compared, method return String ->
        // array of longest chars need to be concatenated
        // 1. Change string to array of chars
        char[] letter = text.toCharArray();
        char[] biggestSequence = new char[letter.length];
        char[] secondSequence = new char[letter.length];
        int longestCounter = 0;
        int secondCounter = 0;
        for(int i = 0; i <= letter.length; i++){
            if(letter[i] <= letter[i+1]){
                biggestSequence[i] = letter[i];
                longestCounter++;
            }
            break;
        }

        for(int position = longestCounter; position <= letter.length; position++){
            if(letter[position] <= letter[position+1]){
                secondSequence[position] = letter[position];
                secondCounter++;
            }
        }
        if(secondCounter >= longestCounter) {
            secondCounter = longestCounter;
            secondSequence = biggestSequence;
        }
        StringBuilder result = new StringBuilder();
        for(int j = 0; j < biggestSequence.length; j++){
            result.append(Character.toString(biggestSequence[j]));
        }

        return text;
    }

}
