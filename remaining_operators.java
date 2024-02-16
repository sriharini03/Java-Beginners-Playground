public class hello_world {
    public static void main(String[] args) {
       int a=9;
        System.out.println(a++);
        /*pre increment increments the value of a variable before
        assigning to another variable*/
        System.out.println(a);
        System.out.println("---------------------");
        int b=15;
        System.out.println(++b);
        System.out.println(b);
        /*post increment assigns the value of a variable to another variable
         and then increment its value */
        System.out.println("-----------------------");
        System.out.println("RELATIONAL OPERATOR");
        //relational operator always returns boolean value(true or false)
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        //also have >=,<=
        System.out.println("-------------------------");
        System.out.println("LOGICAL OPERATOR");
        boolean c=true;
        boolean d= false;
        System.out.println(!c);
        System.out.println(c && d);
        System.out.println(c||d);
        System.out.println("-------------------------");
        /*System.out.println(!a);//'!' can't be applied to int
        //logical operator always take boolean as input(true or false) and
         also return boolean value */
    }
}
//System.out.println();
