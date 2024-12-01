package problemtwo;

public class MinimumCharacter {

    public static void main(String[] args) {
       System.out.println(minCharacter("akel"));
    }

    public static char minCharacter (String input) {
        if(input.length() == 1){
            return input.charAt(0);
        }
        char value1 = input.charAt(0); // a
        char value2 = minCharacter(input.substring(1)); // k
        return value1 < value2 ? value1 : value2;
    }









}
