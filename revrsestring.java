import java.util.*;
public class revrsestring {

    static String revrse(String s, int idx){

        if(idx==s.length()) {

            return "";
        }

        String SmallAns= revrse(s, idx+1);

        return SmallAns+s.charAt(idx);

       


    }

    public static void main(String args []){

        System.out.println("enetr your any charecetr");
    
        Scanner Sc=new Scanner(System.in);

        String s=Sc.nextLine();

        String  ans=revrse(s,0);

        if(ans.equals(s)){
            System.out.println("pilondron number");
        }
        else{
            System.out.println("not pilondrion number");
        }


    }
    
}
