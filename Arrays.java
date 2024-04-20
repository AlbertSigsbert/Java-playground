public class Arrays {
    public static void main(String[] args) {

        //create an array
        // int nums[] = {1,2,3,4};
         
        //Print values
        // for(int i =0; i <3; i++){
        //     System.out.println(nums[i]);
        // }

        //Dynamic sized arrays
        // int values[] = new int [5];

        //By default the values for this are 0s
        // for(int i =0; i <5; i++){
        //     System.out.println(values[i]);
        // }

        
        //Multi-dimensional Arrays
        /*    [1,2,3,4]
              [5,6,7,8]     
              [9,10,11,12]
         
         */

        //  int values[][] = new int[3][4];

         //Assigning random values
        //  for(int i =0; i < 3; i++){
        //     for(int j =0; j <4; j++){
        //         values[i][j] = (int) (Math.random() * 10);
        //     }
        //  }

         //Printing values
        //  for(int i =0; i < 3; i++){
        //     for(int j =0; j < 4; j++){
        //        System.out.print(values[i][j]+ " ");
        //     }
        //     System.out.println();
        //  }
         
         //Using enhanced for loop for multi-dimensional arrays
        //  for(int n[]: values){
        //     for (int m: n){
        //         System.out.print(m+ " ");
        //     }
        //     System.out.println();
        //  }


        //JAGGED ARRAYS

        int jagged[][] = new int[3][];

        //Defining dynamic size of cols
        jagged[0] = new int[4];
        jagged[1] = new int[2];
        jagged[2] = new int[3];

        //Assigning random values
         for(int i =0; i < jagged.length; i++){
            for(int j =0; j <jagged[i].length; j++){
                jagged[i][j] = (int) (Math.random() * 10);
            }
         }

        //Using enhanced for loop for jagged arrays
         for(int n[]: jagged){
            for (int m: n){
                System.out.print(m+ " ");
            }
            System.out.println();
         }


        
    }
}
