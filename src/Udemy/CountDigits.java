package Udemy;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        while (num > 0) {
            // int r = num%10;
            num = num / 10;
            i++;


        }
        System.out.println(i);
    }
}
