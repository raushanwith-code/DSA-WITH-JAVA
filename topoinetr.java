import java.util.Arrays;

public class topoinetr {

    public static void main(String args []){

        int arr[]={23,45,67,78,90,70};
        
        for(int i=0; i<arr.length/2; i++){

            int j=arr.length-1-i;

            int temp=arr[i];
            arr[i]=arr[j];
             arr[j]=temp;

        }
        for(int ele: arr){

            System.out.print(ele+" ");
        }

        }
    }



    