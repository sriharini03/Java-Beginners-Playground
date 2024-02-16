import java.util.*;//imported to use date variable
public class hello_world {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=b;
        a=5;
        System.out.println(a);
        System.out.println(b);
//Primitive variables directly store the actual value.
*********************************************************************************
       Date today=new Date();
       Date another=today;
       today=new Date();
       System.out.println(today);
       System.out.println(another);
//Reference variables store references (memory addresses) to objects.
    }
}
// System.out.println();
