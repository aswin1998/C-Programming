import java.util.*;
import java.lang.*;
public class removeduplicate
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String a =s.nextLine();
        String x="";
        int l,i,count=0,j,k;
        l=a.length();
        char[] c=new char[l];
        for(i=0;i<l;i++)
        {
            c[i]=a.charAt(i);
           
        }
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(c[i]==c[j])
                {
                    c[j]='*';
                }
        }
        }
        
        for(i=0;i<l;i++)
        {
	       if(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z')
	       {
	           
	           x+=c[i];
	       }
        }
        System.out.print(x);
    }
}
