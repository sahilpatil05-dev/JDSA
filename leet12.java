public class leet12 {

    public int[] reval(int[] dig)
    {
        
            for(int i=dig.length-1;i>=0;i--)
            {
                if(dig[i]<9)
                {
                    dig[i]=dig[i]+1;
                    return dig;
                }
                dig[i]=0;

            }
            int res[]=new int[dig.length+1];
            res[0]=1;
        return res;
    }
    public static void main(String[] args) {
        
        int dig[]={1,2,4,6,8};
        leet12 ob=new leet12();
        System.out.println(ob.reval(dig));
    }
}
