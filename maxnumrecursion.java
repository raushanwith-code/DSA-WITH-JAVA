public class maxnumrecursion {

    static int maxNum(int arr[], int idx){

        if(idx==arr.length-1) return arr[idx];

        int smallans=maxNum(arr, idx+1);

        return Math.max(smallans, arr[idx]);


    }
    public static void main(String args []){

    
        System.out.println("enetr your any chareceter");

       int arr[]={34,67,78,12};

       System.out.println(maxNum(arr,0));



    }
    
}
