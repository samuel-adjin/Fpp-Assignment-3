package problemfour;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12210));
    }

    public static boolean isPalindrome(int x) {
        return reverse(x,0) == x;
    }

    private static int reverse(int x, int rev) {
        if(x == 0){
            return rev;
        }
        int lastDigit = x % 10;
        rev = rev * 10 + lastDigit;
        return reverse(x/10,rev);
    }
}
