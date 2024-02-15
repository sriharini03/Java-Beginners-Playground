public class hello_world {
    public static void main(String[] args) {
        byte a=10;//range[-128 to 127]
        short a1=32000;//[-32K to 32K]
        int b=10000000;//range[-2B to 2B]
        long c=1000000000000L;
        //compiler takes number as integer by default so L must be mentioned at last
        float e=12.25F;
        //compiler takes decimal as double by default so F must be mentioned at last
        double f=12.5555555555;
        char ch='a';
        boolean b1=true;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);
        System.out.println(ch);
        System.out.println(b1);
    }
}
