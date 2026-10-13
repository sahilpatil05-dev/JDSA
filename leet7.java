public class leet7 {


    public int returnarr(int[] nums,int val)
    {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String [] args)
    {
        leet7 ob=new leet7();
        int nums[]={3,2,2,3};
        System.out.println(ob.returnarr(nums,3));
        
    }
    
}
