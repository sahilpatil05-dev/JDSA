import java.util.*;

public class base {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the vallue of n :");
        int n=sc.nextInt();
        int t=n;
        int nod=0;

        while (t!=0) {
            t=t/10;
            nod++;
            
        }

        int div=(int)Math.pow(10, nod-1);

        while(div!=0)
        {

            int q=n/div;
            System.out.println(q);

            n=n%div;
            div=div/10;
        }



        //finding the lengthof n
        // String s= Integer.toString(n);
        // System.out.println(s.length());




        
        


       



    }
    
}
