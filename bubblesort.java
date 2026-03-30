public class bubblesort {

    public static void main(String args []){

        int arr[]={12,67,34,12,90,34,12,67};

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
    
}
