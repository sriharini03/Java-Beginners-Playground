//Iterative statements
// for(Initialization;Condition;Updation){}
//while(Condition){}
//do{}while(Condition)
    public class hello_world {
    public static void main(String[] args) {
     for(int i=0;i<=3;i++){
         System.out.println("Hello World!");
     }
     //Sum of n natural numbers using for loop
        // n must be known
     int sum=0,n=10;
        int i;
     for(i=1;i<=n;i++){
         sum +=i;
     }
        System.out.println("Sum of numbers: "+sum);

     //Sum of n natural numbers using while loop
        //run until the condition becomes false
        //used when n is not known
        while(i<=n){//entry controlled loop
            sum+=i;
            i++;
        }
        System.out.println("Sum of numbers: "+sum);

        //Sum of n natural numbers using do-while loop
        do{//exit controlled loop
            sum+=i;
            i++;
        }while(i<=n);
        System.out.println("Sum of numbers: "+sum);
    }
}

//System.out.println();
