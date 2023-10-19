import java.util.*;

public class arrayWithRandom{
    public static void main(String a[]){ 
        int array[][] = new int[2][3];

        for(int i = 0;i < 2; i++){
           for(int j = 0; j < 3; j++){
             array[i][j] = (int) (Math.random() * 100);
            // System.out.println(array[i][j]);
           } 
        };

        //  for(int i = 0;i < 2; i++){
        //    for(int j = 0; j < 3; j++){
        //     System.out.print(array[i][j] + " ");
        //    }
        //    System.out.println();
        // };

        for(int n[] : array){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    };
};