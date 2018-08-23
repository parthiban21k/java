import java.util.*;
class Guvip10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next().toLowerCase();
        String s2=sc.next().toLowerCase();
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
            for(int j=i;j<s2.length();j++)
            {
                if(s1.charAt(i)!=s2.charAt(j))
                {
                    c++;
                }
                i++;
            }
        }
        if(c==1)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}


