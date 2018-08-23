import java.util.*;
class Guvip8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().toLowerCase();
        String s2[]=s1.split(" ");
        String s3="";
        for(int i=0;i<s2.length;i++)
        {
            s3=s2[i].substring(0,1).toUpperCase()+s2[i].substring(1);
            System.out.print(s3+" ");
        }
        
    }
}


