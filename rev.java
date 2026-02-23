import java.util.*;
public class rev {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println(" The value of n :");
        int n=sc.nextInt();
        while (n>0 || n!=0) {

            int d=n%10;
            n=n/10;
            System.out.print(d);
            
        }

        // System.out.println("Enter the String :");

        // String st=sc.nextLine();


        // int k=Integer.parseInt(st);

        // while(k>0)
        // {
        //     int rem=k%10;
        //     k=k/10;
        //     System.out.println(rem);
        // }

        
    }
    
}
