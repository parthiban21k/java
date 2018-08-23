import java.util.*;
class Guvip7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2="";
        int l=s1.length();
        for(int i=0;i<l;i++)
        {
            if(i%2==0)
            {
                s2+=String.valueOf(s1.charAt(i+1));
            }
            else
            {
                s2+=String.valueOf(s1.charAt(i-1));
            }
        }
        
        System.out.print(s2);
    }
}


