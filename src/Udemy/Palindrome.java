package Udemy;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int rev = 0;
        while (num > 0) {
            int r = num % 10;
            num = num / 10;
            rev = rev * 10 + r;
        }
        System.out.println("reversed number is " + rev);
        if (num == rev) {
            System.out.println("This is palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
