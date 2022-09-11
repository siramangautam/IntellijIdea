package pack;
public class SampleTwo {
    static void Meth(int x){
         x++;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int a = 5;
        Meth(a);
        System.out.println(a);
    }
}
