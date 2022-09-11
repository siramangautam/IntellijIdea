package Udemy;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sum =0;
        int num = sc.nextInt();
        int count = 0;
        while (num>0){
        int r = num%10;
        num = num/10;
        sum = sum+ r*r*r;

    }
        if (sum == num){
            System.out.printf("%d is an armstrong number",num);
        }
        else {
            System.out.printf("%d is not an armstrong number.",num);
        }

        }
    }


