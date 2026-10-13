import java.util.*;

public class leet6 {

    public int replace(int[] nums)
    {
        int i=0;
        int k=0;
        for(int j=1;j<nums.length;j++)
        {
            
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        
            
        }
        return i+1;

    }

    
    public static void main(String[] args) {
        
        leet6 ob=new leet6();
        int nums[]={3,4,4};
        System.out.println(ob.replace(nums));
    }
}
