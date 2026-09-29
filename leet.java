public class leet {

   public int[] twosum(int[] num,int tar)
   {
    for(int i=0;i<num.length;i++)
    {
        for(int j=i+1;j<num.length;j++)
        {
            if(num[i]+num[j]==tar)
            {
                return new int[]{i,j};
            }
        }
    }
    return new int[]{};
   }
    public static void main(String[]args)
    
    {

        leet ob=new leet();

        int[] num=new int[4];
        num[0]=2;
        num[1]=7;
        num[2]=11;
        num[3]=15;
        
        int[] result = ob.twosum(num, 13);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

    }
}