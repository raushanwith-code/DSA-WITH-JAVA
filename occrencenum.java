import java.util.*;
public class occrencenum{

    static String removeA(String s, int idx){

        if(idx==s.length()) return "";

        String SmallAns=removeA(s,idx+1);

        char ans=s.charAt(idx);

        if(ans !='a'){

            return SmallAns+ans;
        }
        else{

            return SmallAns;
        }
    }

    public static void main(String args []){

        Scanner Sc=new Scanner(System.in);

        String s=Sc.nextLine();

        System.out.println(removeA(s,0));

    }
}