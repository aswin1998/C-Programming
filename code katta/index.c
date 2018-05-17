import java.util.*;
import java.util.ArrayList;
public class rep{
      public static void main(String aa[]){
            int n;
            int f=0;
             Scanner s=new Scanner(System.in);
             n=s.nextInt();
             int pp=0;
             int count=0;
             int b[]=new int[n];
               ArrayList<Integer>d=new ArrayList<Integer>();
             for(int i=0;i<n;i++){
                 b[i]=s.nextInt();
             }
             for(int i=0;i<n;i++){
                 if(b[i]==i){
                    d.add(i);
                    f=1;
                 }
             }
         Collections.sort(d);

             if(f==0){
                 System.out.println("-1");
             }
         for(int y:d){
             System.out.print(y);
         }
         

    }
}
