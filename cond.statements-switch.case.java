public class hello_world {
    public static void main(String[] args) {
      boolean attended=true;
      int total_precent=40;
      if(attended==true){
          if(total_precent==50){//nested if
              System.out.println("I am present");
          }
          else{
              System.out.println("Print nothing");
          }
      }
      else {
          System.out.println("I am not present");
      }
        System.out.println("--------------------");
      int a=10;
      int b=20;
      int c=25;
      if(a>b && a>c) {
          System.out.println("Print"+a);
      }
      else if(b>a && b>c){
          System.out.println("Print"+b);
      }
      else{
          System.out.println("Print"+c);
      }
        System.out.println("-----------------------");
      
      
//Switch case
        char attendance='O';
        switch(attendance)
        {
            case 'O':
                System.out.println("Student On-duty");
                break;
            case 'A':
                System.out.println("Student attended the class");
                break;
            case 'N':
                System.out.println("Student not attended the class");
                break;
                //if break is not provided then compiler will print all the statements below 
            //hence break must be provided in switch case
            default:
                System.out.println("Invalid");
        }
    }
}

//System.out.println();
