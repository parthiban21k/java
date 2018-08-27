import java.util.*;
class Guvip24
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
        if(Character.isDigit(s1.charAt(i)))
        {
            c++;
        }
        }
        if(c==s1.length())
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}





