import java.util.*;  
class sum{  
 public static void main(String args[]){  
  Scanner sc=new Scanner(System.in);
  int n,i,j,k;
  n=sc.nextInt();
  int a[]=new int[n];
    int b[]=new int[n];
  for(i=0;i<n;i++)
  {
      a[i]=sc.nextInt();
      
  }
  for(i=0;i<n;i++)
  {
      for(j=i+1;j<n;j++)
      {
        if(a[i]+a[j]==0)
        {
            System.out.print(a[i]+" "+a[j]);
        }
      }
  }
  
  }  
 }
