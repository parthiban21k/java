import java.util.*;
class positive
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==0){
            System.out.println("ZERO");
        }
        else if(n>0){
            System.out.println("POSITIVE");
        }
        else if(n<0){
            System.out.println("NEGATIVE");
        }
        
    }
}
