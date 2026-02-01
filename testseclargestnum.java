import java.util.*;
public class testseclargestnum {

    public static void main(String args []){

        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;


        int arr[]={12,23,34,56,78};

        for(int i=0; i<arr.length; i++){

            if(arr[i]>max){
                
                secmax=max;

                max=arr[i];

          

            }
        }

        System.out.println("your final result is:");
        for(int i=0; i<arr.length; i++){

            if(arr[i]!=max && arr[i]>secmax ){

                secmax=arr[i];
            }
             
        }
         System.out.println(secmax);
      
    }
    
}
