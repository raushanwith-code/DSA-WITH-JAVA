import java.util.*;
public class inputstringbuilder {

  public static void main(String[] args) {

    Scanner Sc=new Scanner(System.in);

    String n=Sc.nextLine();

    StringBuilder sb=new StringBuilder(n);

    sb.reverse();
    sb.append(417412);
    System.out.println(sb);
    
    
  }
  
}
