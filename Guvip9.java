import java.util.*;
import java.math.*;
class Guvip9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        BigInteger b1;
        String s1="";
        for(int i=n1;i<n2;i++)
        {
            s1=String.valueOf(i);
            b1=new BigInteger(s1);
            if(b1.isProbablePrime(5))
            {
                System.out.print(s1+" ");
            }
        }
    }
}
