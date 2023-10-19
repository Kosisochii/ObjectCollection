import java.util.*;

public class arrayOfArrays{
    public static void main(String a[]){
        int myArray[][] = new int[3][3];
        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[0][2] = 3;
        myArray[1][0] = 3;
        myArray[1][1] = 5;
        myArray[1][2] = 9;
        myArray[2][0] = 6;
        myArray[2][1] = 7;
        myArray[2][2] = 8;
        for(int i = 0; i < myArray.length; i++){
            System.out.println(Arrays.toString(myArray[i]));
        }
    }
};