package Method;

import java.util.Arrays;

public class Meth {
    static void update( int A[]){
        A[0] = 1;
    }

    public static void main(String[] args) {
        int A[] = {7,8,9,10,11,12};
        update(A);
        System.out.println(Arrays.toString(A));
    }
}
// call by reference
