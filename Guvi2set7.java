import java.util.*;
import java.math.*;
class Guvi2set7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int l=Integer.valueOf(s1);
        int n1=0;
        int n2=0;
        int l1=s1.length();
        for(int i=0;i<l1;i++)
        {
            n1=Character.getNumericValue(s1.charAt(i));
        n2+=Math.pow(n1,3);
        }
        if(n2==l)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}
