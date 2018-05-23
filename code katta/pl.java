import java.util.*; 
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         int i,n;
        String s=sc.nextLine();
        Stack st=new Stack();
        n=s.length();
        for(i=0;i<n;i++)
        {
            st.push(s.charAt(i));
        }
String reverse = "";

        while (!st.isEmpty()) {
            reverse = reverse+st.pop();
        }

        if (s.equals(reverse))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
