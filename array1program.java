import java.util.*;
public class array1program {

    public static void main(String args []){

        Scanner Sc=new Scanner(System.in);

      int arr[]=new int [5];

        for(int i=0; i<arr.length; i++){

            arr[i]=Sc.nextInt();

          
        }

        for(int i=0; i<arr.length; i++){

            System.out.println(arr[i]);
        }


    }
    
}
