package Udemy;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4== 0){
            System.out.printf("%d is a leap year\n",year);
        }
        else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
