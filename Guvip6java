import java.util.*;
class Guvip6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
         ArrayList<Character> al=new ArrayList<Character>();
        for(int i=0;i<s1.length();i++)
        {
            al.add(s1.charAt(i));
        }
        ArrayList<Character> all=new ArrayList<Character>();
        for(int i=0;i<s2.length();i++)
        {
            all.add(s2.charAt(i));
        }
        String s3="",s4="";
        LinkedHashSet<Character> hl=new LinkedHashSet<Character>(al);
       
        for(Character nl:hl)
        {
             s3+=Collections.frequency(al,nl);
        }
         LinkedHashSet<Character> hll=new LinkedHashSet<Character>(all);
        for(Character nll:hll)
        {
             s4+=Collections.frequency(all,nll);
        }
       if(s3.equals(s4))
       {
           System.out.print("yes");
       }
       else
       {
           System.out.print("no");
       }
    }
}

