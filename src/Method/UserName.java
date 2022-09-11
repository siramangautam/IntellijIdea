package Method;

import java.util.Scanner;

public class UserName {
    Scanner sc = new Scanner(System.in);
    String email = sc.next();
     String id(){
        int l = email.indexOf("@");
        String userid = email.substring(0,l);
        return userid;
    }

    public static void main(String[] args) {
        UserName id1 = new UserName();
       String e =  id1.email;
       String f = id1.id();
        System.out.println(f);
    }
}
