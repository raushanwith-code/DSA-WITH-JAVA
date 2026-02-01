class testsort{
    public static void main(String args []){

        int arr[]={12,45,12,67,24,89,23};

        int i=0;
        int j=arr.length-1;

        while(i<=j){

        int temp=arr[i];

          arr[i]=arr[j];

          arr[j]=temp;
          i++;
          j--;
        }

        for(int ele: arr){

            System.out.print(ele+" ");
        }


    }
}