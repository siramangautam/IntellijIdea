package pack;

import java.util.Scanner;

public class factorial {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

     static int factorial(int x){
    int fact = 1;
        for (int i=1; i<=x; i++){
           fact = fact * i;
    }
        return fact;
    }

    public static void main(String[] args) {
         factorial value = new factorial();
        int cd = value.x;
        int v = factorial(cd);
        System.out.println(v);
    }

}
