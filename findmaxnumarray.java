public class findmaxnumarray {

    public static void main(String args []){

        int arr[]={34,67,89,12,67,34};

        float max=arr[0];

        for(int i=1; i<arr.length; i++){

            if(arr[i]<max){

               max=arr[i];
            }


        }

        System.out.println(max);
    }
    
}
