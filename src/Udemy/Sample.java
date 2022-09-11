package Udemy;

public class Sample {
    public static void main(String[] args) {
        String str = "xyz@gmail.com";
        int index = str.indexOf('@');
        System.out.println("domain is "+ str.substring(index+1,str.length()));
        System.out.println("username is "+ str.substring(0,index));
    }
}
