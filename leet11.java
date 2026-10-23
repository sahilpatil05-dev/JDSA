import java.util.*;
public class leet11 {
    
    public  List<Integer> get(int[] nums,int tar)
    {
        List<Integer> num=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
        for(int b:nums){
            System.out.print(b+" ");
        }
        System.out.println();
        for(int n=0;n<nums.length;n++)
        {
            if(nums[n]==tar)
            {
                num.add(n);
            }
        }
        return num;
    }
    
    public static void main(String[] args) {
        
        int nums[]={12,4,2,9,34};
        int tar=12;
        leet11 ob=new leet11();
        System.out.println(ob.get(nums, tar));
}
}