import java.util.Scanner;

public class PositiveOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x>0){
            System.out.println("Number is positive");
        }
        else if(x<0){
            System.out.println("Number is negative.");
        }
        else {
            System.out.println("Number is zero.");
        }
    }
}
