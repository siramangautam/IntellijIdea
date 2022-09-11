package Method;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModification {
    static void change(int[] A, int index, int value){
            A[index]= value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 3;
        int value = 5;
        int Arr [] = {6,21,30,25,41,56,78};
        change(Arr, index, value);
        System.out.println(Arrays.toString(Arr) );
    }
}
