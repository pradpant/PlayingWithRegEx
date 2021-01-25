
import java.util.regex.*;  
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
   {
      Scanner sc=new Scanner(System.in);
    //Test Case Inputs
    int t=Integer.parseInt(sc.next());
    for(int i=0;i<t;i++){
        String s=sc.next();
        int l=s.length();
        if(l <10)
        {
            System.out.println("No");
        }
        else
        {
              if((Pattern.matches("^[a-zA-Z][a-zA-Z0-9[@#%&?]]{8,}[a-zA-Z]", s)))  
                System.out.println("YES");
            else    
                System.out.println("NO");
        }
    }
  }
}