import java.util.*;  
class printpossiblities{  
 public static void main(String args[]){  
  Scanner sc=new Scanner(System.in);
  int n,i,j,k;
  n=sc.nextInt();
  int a[]=new int[n];
    int b[]=new int[n];
  for(int i=0;i<n;i++)
  {
      a[i]=sc.nextInt();
      
  }
  for(i=0;i<n;i++)
  {
      for(j=i+1;j<n;j++)
      {
          for(k=j+1;k<n;k++)
          {
              if((a[i]+a[j])==a[k])
              {
                  System.out.println(a[i]+" "+a[j]+" "+a[k]);
              }
          }
      }
  }
  }  
 } 
