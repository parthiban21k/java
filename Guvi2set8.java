import java.util.*;
import java.math.*;
class Guvi2set8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3="";
        int n3=0;
        int  p=0;
        int c=0;
        int n1=Integer.valueOf(s1);
        int n2=Integer.valueOf(s2);
        for(int i=n1;i<n2;i++)
        {
            s3=String.valueOf(i);
            p=0;
            for(int j=0;j<s3.length();j++)
            {
            n3=Character.getNumericValue(s3.charAt(j));
            p+=Math.pow(n3,3);
            }
            if(p==i){
            System.out.print(p+" ");
            }
        }
    }
}
