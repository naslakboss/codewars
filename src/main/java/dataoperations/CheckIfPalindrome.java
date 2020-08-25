package dataoperations;

public class CheckIfPalindrome {
    public static boolean checkIfPalindrome(int x){

        int reverse = x;

        char[] chars = Character.toChars(reverse);
        int length = chars.length;
        for(int i = length - 1; i >= 0; i--){
            reverse =  chars[i];
        }
        System.out.println(reverse);
        if(x == reverse){
            return  true;
        }
        else return false;
    }
}
