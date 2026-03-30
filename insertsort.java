public class insertsort {

    static void insrtSort(int arr[]){

        for(int i=0; i<arr.length; i++){

            int j=i;

           while(j>0 && arr[j]<arr[j-1]){

            int temp=arr[j];

            arr[j]=arr[j-1];

            arr[j-1]=temp;

            j--;


           }
        }
    }

    public static void main(String args []){

       int  arr[]={45,89,12,6,90,3};

       insrtSort(arr);

       for(int i=0; i<arr.length; i++){

        System.out.println(arr[i]);
       }


    }
    
}
