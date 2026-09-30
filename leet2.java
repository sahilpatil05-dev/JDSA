    public class leet2 {


        public boolean check(int n)

        {

            if(n<0)
            {
                return  false;
            }

            int d=0;
            int o=n;
            int r=0;
            while(n!=0)
            {
                d=n%10;
                r=r*10+d;
                n=n/10;
            }
            if(o==r)
            {
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
            

            leet2 ob=new leet2();
            System.out.println("The final ans :"+ob.check(-121));
            
        
            
        }
    }
