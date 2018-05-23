import java.io.IOException;
 import java.util.*; 
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,temp=0,k,m;
        
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        
           System.out.print(a[k-1]); }
}
