import java.util.*;
public class Binary {
    

    public static int binarysearch(int[] nums,int target)
    {
        int left=0;
        int right=nums.length-1;

        while (left <= right) {
            int mid=(left + right)/2;

            if(nums[mid]==target)
            {
                return mid;
            }else if(nums[mid] < target)
            {
                left=mid+1;
            }else

                {
                    right=mid-1;
                }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int nums[]={20,30,40,50,60,70,80};
        int target=40;

        int res=binarysearch(nums,target);

        if(res != -1)
        {
            System.out.println("Target found at index :"+res);
        }else
        {
            System.out.println("Target not found...");
        }
    }
    
}