import java.util.*;
class Guvip11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int c=0;
        String s2[]={"monday","tuesday","wednesday","thrusday","friday"};
        for(int i=0;i<s2.length;i++)
        {
            if(s2[i].equals(s1)){
                c++;
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
