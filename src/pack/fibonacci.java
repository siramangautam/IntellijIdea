package pack;

import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {
        int arr[];
        arr = new int[20];
        arr[0]= 1;
        arr[1]= 2;
        for (int i = 2; i<arr.length; i++){
            arr[i]= arr[i-1] + arr[i-2];

        }
        //System.out.println(Arrays.toString(arr));
        for (int element: arr){
            System.out.print(element+" ");
        }


    }
}
