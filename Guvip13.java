import java.util.*;
class Guvip13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int n=0;
        double n1=0;
        for(int i=0;i<s1.length();i++)
        {
            n=Character.getNumericValue(s1.charAt(i));
            n1+=Math.pow(n,2);
        }
        System.out.print((int)n1);
    }
}



