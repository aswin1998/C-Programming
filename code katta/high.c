/*package whatever //do not write package name here */
#include<stdio.h>
void print(int *num,int n)
{
      int max=-1;
     for(int i=0;i<n;i++)
    {
      
        if(num[i]>max)
        {
            max=num[i];
           
           
        }
         
    }
      printf("%d",max);
}
int main()
{
    int num[100],i,j,k,n,count[100];
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&num[i]);
    }
    int temp;
    for (j = 1; j <= n; j++) {
        for (i = 0; i < n-1; i++) {
            temp = num[i];
            num[i] = num[i+1];
            num[i+1] = temp;
            print(num,n);
        }
        
    }
   
}
