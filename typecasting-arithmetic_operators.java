public class hello_world {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        //as the values are stored in int,the output we got is also integer
        //output:0-----expected output:0.5
        //therefore we got a concept called "typecasting"
        /*when the compiler converts lower datatype to higher one by itself,
        we call it as Implicit Type Conversion or Implicit typecasting*/
        float h=a/b;//Implicit typecasting is done here
        float i=(float)a/(float)b;//typecasting is done here
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }
}
//System.out.println();
