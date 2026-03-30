import java.util.*;
public class trgetSum{

    static int unicNum(int arr[],int target ){

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

        System.out.println("enetr youir arrey size");
    
        Scanner Sc=new Scanner(System.in);

        int n=Sc.nextInt();

        int arr[]=new int[n];

        for(int i=0; i<arr.length; i++){

            arr[i]=Sc.nextInt();
        }
        System.out.println("enetr your target number");

        int target=Sc.nextInt();

        System.out.println("your final result");

        System.out.println(unicNum(arr,target));

        

    }

}