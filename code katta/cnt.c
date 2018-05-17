#include<stdio.h>
int main()
{
    int a[100],i,j,k,n,count[100];
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        count[a[i]]=0;
    }
    for(i=0;i<n;i++)
    {
        count[a[i]]++;
    }
    int max=-1;
    for(i=0;i<n;i++)
    {
        if(count[a[i]]>1)
        {
            max=count[a[i]];
            printf("%d",a[i]);
        }
    }
}
