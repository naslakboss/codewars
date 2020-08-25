package dataoperations.Strings;

public class PangramChecker {
    public static boolean check(String sentence){
        //tools -> if for every letter
        // String methods -> replace all and ?
        // Stream API -> sort, filter and ect.
        char[] letters = sentence.toCharArray();
        String regex = "[a-zA-Z0-9]";
        int count =0;
        for(int i = 0; i < letters.length; i ++){
            String s =Character.toString(letters[i]);
            if(s.matches(regex)){
                count ++;
                regex = regex + "^" +letters[i];
            }
        }
        if(count >= 26){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean check2(String sentence){

        boolean[] mark = new boolean[26];

        int index = 0;

        for(int i = 0; i < mark.length; i++){
            if('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z'){
                index = sentence.charAt(i) - 'A';
            }
            else if('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z'){
                index = sentence.charAt(i) - 'a';
            }
            else
                continue;
            mark[index] = true;
        }
        for(int i = 0; i <= 25; i++){
            if(mark[i] == false){
                return false;
            }
        }
        return true;
    }
}
