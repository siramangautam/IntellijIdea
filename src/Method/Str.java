package Method;

public class Str {
        public static void main(Str[] args) {
            String email = new String();
            email = "abx@gmail.com";
            int i = email.indexOf("@");

            //System.out.println("userid"+ email.subSequence(i,1));
            System.out.println("domain name"+email.substring(i));



        }

    }
