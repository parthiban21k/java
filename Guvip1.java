import java.util.*;
class Guvip1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int l=s1.length();
        if(l<100000)
        {
        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();
        System.out.println(sb);
        }
    }
}
