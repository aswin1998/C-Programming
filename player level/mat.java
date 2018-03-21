/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int columns=rows;
		int a[][]=new int[rows][rows];
		int i,j;
		for(i=0;i<rows;i++)
		{
		    for(j=0;j<columns;j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		
	}
	int sum1=0,sum2=0;
		for(i=0,j=0;i<rows && j<columns;i++,j++)
		{
		   
		        sum1=sum1+a[i][j];
		    }
		
			for(i=0,j=columns-1;i<rows && j>=0;i++,j--)
		{
		    
	        sum2=sum2+a[i][j];
		    }
		int tot=sum1*sum2;
		System.out.println(tot);
	}
}
