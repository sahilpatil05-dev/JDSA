import java.util.Scanner;

public class basic {


    Scanner sc=new Scanner(System.in);


   
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double m=5.8;
        long c=(long)m;
        int a=(int)c;
        short n=(short)a;
        byte b=(byte)n;
        System.out.println(b);
        //Just some logics related to casting.....

        System.out.println("Enter the number : ");
        String s1=sc.nextLine();
        int v=Integer.parseInt(s1);
        System.out.println(v);
        //Next one to store a integer in String....

        int h=90;
        h++;
        h--;
        System.out.println(h);//Something


    
    }
    
}
