
    public class hello_world {
    public static void main(String[] args) {
       int[] arr=new int[20];
       arr[1]=10;
       arr[4]=5;
       for(int i=0;i<10;i++) {
           System.out.println(arr[i]);
       }
       
       //Multidimensional array
       System.out.println("----------------------");
        System.out.println("Multi dimensional array");
       int[][] matrix=new int[2][2];
       matrix[0][0]=4;
        matrix[0][1]=4;
        //matrix[0][2]=4;//ArrayIndexOutOfBoundException
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
//for 3D array int[][][] arr=new int[][][];
//same for the remaining multidimensional arrays
    }
}


//System.out.println();
