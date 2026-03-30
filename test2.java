import java.util.*;
public class test2 {

    static String revrseString(String s, int idx){

        if(idx==s.length()){
          
            return "";
        }

        String revrseStrings=revrseString(s, idx+1);

        return revrseStrings+s.charAt(idx);


      


    }

    public static void main(String args []){

        System.out.println("enetr your any charecter");

        Scanner Sc=new Scanner(System.in);

        String s=Sc.nextLine();

        System.out.println(revrseString(s, 0));




    }
    
}
