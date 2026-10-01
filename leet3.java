public class leet3 {


    public int value(char s)
    {
        
        if(s == 'I')
        {
            return 1;
        }else if(s == 'V')
        {
            return 5;
        }else if(s == 'X')
        {
            return 10;
        }else if(s == 'L')
        {
            return  50;
        }else if(s == 'C')
        {
            return 100;
        }else if(s == 'D')
        {
            return 500;
        }else if(s == 'M')
        {
            return 1000;
        }
        return 0;
        
    }

    public int roman(String s)
    {
        
        int res=0;
        
        for(int i=0;i<s.length()-1;i++)
        {
            int cur=value(s.charAt(i));
            int next=value(s.charAt(i+1));

            if(cur<next)
            {
                res  =res-cur;
            }else
            {
                res= res+cur;
            }
        }
        return res + value(s.charAt(s.length() - 1));
        
        
    }

    

    public static void main(String[] args) {

        leet3 ob=new leet3();
        System.out.println(ob.value('X'));
        System.out.println(ob.roman("IV"));
    

    }
}
