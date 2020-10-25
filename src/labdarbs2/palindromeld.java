package labdarbs2;

import java.util.Scanner;

public class palindromeld { // variant number 0 because my apliceciba numurs ir 181RDB182 -> 181182 % 2 = 0

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        if (palindrome(s.toLowerCase()))
            System.out.println("It's a palindrome");
        else
            System.out.println("It;s not a palindrome");
        scanner.close();
    }
        public static boolean palindrome (String s) {
            if(s.length() == 0 || s.length() == 1)
                return true;
            if(s.charAt(0) == s.charAt(s.length()-1))
                return palindrome(s.substring(1, s.length()-1));
            return false;
        }
}
