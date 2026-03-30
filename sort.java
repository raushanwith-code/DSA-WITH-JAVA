import java.util.*;
public class sort {

    static void sortNum(int arr[]){

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){

                if(arr[i]>arr[j]){
                     
                int temp=arr[i];

                arr[i]=arr[j];

                arr[j]=temp;

                }

               
            }
        }
      for(int i=0; i<arr.length; i++){

        System.out.println(arr[i]);
      }

     
    }

    public static void main(String args []){

        System.out.println("enter your arre element");

        Scanner Sc=new Scanner(System.in);


        int n=Sc.nextInt();

        int arr[]=new int[n];

        for(int i=0; i<arr.length; i++){

            arr[i]=Sc.nextInt();
        }

        System.out.println("your result is");

        sortNum(arr);

       

        






    }
    
}
