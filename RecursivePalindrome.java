package recursive;

public class RecursivePalindrome {
    public static boolean isPalindrome(String s) {
        return isPalindrome(s,0,s.length()-1);
    }
    public static  boolean isPalindrome(String s,int low,int high) {
        if (high<=low) {
            return true;
        }else {
            return isPalindrome(s,low+1,high-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Is moon a palindrome"
        +isPalindrome("moon"));
        System.out.println("Is a a palindrome"
        +isPalindrome("a"));
    }
}
