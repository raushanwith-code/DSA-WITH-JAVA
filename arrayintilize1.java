import java.util.*;
public class arrayintilize1 {

    public static void main(String args []){

        System.out.println("enetr your arrey element");

        Scanner Sc=new Scanner(System.in);

        int arr[]=new int[6];

        for(int i=0; i<arr.length; i++){

            arr[i]=Sc.nextInt();
        }

        System.out.println("your final result iis");

        for(int i=0; i<arr.length; i++){

            System.out.println(arr[i]);
        }
    }
    
}
