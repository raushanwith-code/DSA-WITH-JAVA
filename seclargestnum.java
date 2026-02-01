import java.util.*;
public class seclargestnum {

    public static void main(String args []){

        System.out.println("enetr your arrey size");

        Scanner Sc=new Scanner(System.in);

        int max=Integer.MIN_VALUE;
         int secmax=Integer.MIN_VALUE;

        int n=Sc.nextInt();

        int arr[]=new int [n];
        System.out.println("enetr youe arrey element");

        for(int i=0; i<arr.length; i++){

            arr[i]=Sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){

            if(arr[i]>max){
            secmax=max;
                max=arr[i];
            }
        }
        
        System.out.println("your final result is :");
        for(int i=0; i<arr.length; i++){

            if(arr[i] !=max && arr[i]>secmax ){

                secmax=arr[i];
                
            }
        }
        System.out.println(secmax);
    }
    
}
