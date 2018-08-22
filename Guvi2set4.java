import java.util.*;
class Guvi2set4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1<=10000&& n2<=10000)
        {
        for(int i=n1;i<n2;i++)
        {
                if(i%2!=0)
                {
                    System.out.print(i);
                }
        }
        }
    }
}
