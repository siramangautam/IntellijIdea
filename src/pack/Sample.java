package pack;

public class Sample {
    int Mp(int x, int y) {
        if (x>y){
            return x;
        }
        else {
            return y;
        }

    }

    public static void main(String[] args) {
        Sample obj = new Sample();
        int a = 45;
        int b = 50;
        System.out.println(obj.Mp(a,b));
    }


    }
