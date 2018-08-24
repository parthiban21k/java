import java.util.*;
class Guvip14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s3="";
        char ch=' ';
        for(int i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
            {
                //s2+=String.valueOf(s1.charAt(i));
            }
            else
            {
                s3=s3+String.valueOf(s1.charAt(i));
            }
        }
        StringBuffer sb=new StringBuffer(s3);
        sb.reverse();
        System.out.print(sb);
    }
}




