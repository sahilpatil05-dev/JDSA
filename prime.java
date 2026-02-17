import java.util.*;

public class prime {

    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        int t;
        System.out.println("The value of t :");
        t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();

            int count=0;
            for(int d=2;d*d<=n;d++)  //n->root n if the number is not divisible than it cannot be divisible any further 
            {
                if(n%d==0)
                {
                    count++;
                    break;

                }

            }
            if(count==0)
            {
                System.out.println("Prime number");
            }else
            {
                System.out.println("Non prime number");
            }
        }



        
    }
    
}
