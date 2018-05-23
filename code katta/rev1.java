import java.util.*; 
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         int i,n;
 
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        String s2="";
        
        for(i=0;i<s1.length;i++)
        {
  StringBuffer sb=new StringBuffer(s1[i]);
  System.out.print(sb.reverse()+" ");
        }

    }
     
}
