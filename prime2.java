    import java.util.*;
    public class prime2 {
        public static void main(String[] args) {

            Scanner sc=new Scanner (System.in);
            
            System.out.print("Enter the low range :");
            int low=sc.nextInt();


            System.out.print("Enter the High range :");
            int high=sc.nextInt();

            for(int i=low;i<=high;i++)
            {
                int count=0;

                for(int d=2;d*d<=i;d++)
                {
                    if(i % d ==0)
                    {
                        count++;
                        break;
                    }
                }
                if(count==0)
                {
                    System.out.println(i);
                }
            }

                

                
            }

            



        }
        

