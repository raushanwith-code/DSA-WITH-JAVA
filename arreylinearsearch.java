import java.util.*;
public class arreylinearsearch {

    public static void main(String args []){

        System.out.println("enter your arrey element");

        Scanner Sc=new Scanner(System.in);


        int arr[]=new int [5];

        for(int i=0; i<arr.length; i++){

            arr[i]=Sc.nextInt();
        }
        System.out.println("target");
         int target=Sc.nextInt();

         boolean flag=false;

        for(int i=0; i<arr.length; i++){

            if(arr[i]==target){

               flag=true;
              break;
            }

        }

        if(flag==true){

            System.out.println("found element");
        }else{

            System.out.println("not element found");
        }

        
    }


    
}
