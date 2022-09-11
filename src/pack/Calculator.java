package pack;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        double x = sc.nextDouble();
        System.out.println("Enter either of + - * /");
        char z = sc.next().charAt(0);
        System.out.println("Enter 2nd Number: ");
        double y = sc.nextFloat();
        double result = 0;
        switch (z) {
            case '+':
                result = x + y;
            case '-':
                result = x - y;
                if (x > y) {
                    result = x - y;
                } else if (x < y) {
                    result = y - x;
                }
            case '*':
                result = x * y;
        }
        System.out.printf("%.1f %c %.1f = %.1f", x, z ,y , result);

    }
}
