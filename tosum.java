import java.util.*;
class tosum{


    static int ToSum(int arr[],int target){

        int ans=0;

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++){

                if(arr[i]+arr[j]==target){

                    ans++;


                }


            }
           
        }
         return ans;
    }

    public static void main(String args []){
       System.out.println("enter your size");

        Scanner Sc=new Scanner(System.in);

        int n=Sc.nextInt();
      
     
        int arr[]=new int[n];

        System.out.println("enter your arre element");

        for(int i=1; i<arr.length; i++){

            arr[i]=Sc.nextInt();
        }
        System.out.println("enter your trget");
        
      int target=Sc.nextInt();
      System.out.println("enter final result");

      System.out.println(ToSum(arr,target));
    }
}
