public class Time {
    

    public static int Linear(int[] nums,int tar)
    {
        int step=0;

        for(int i=0;i<nums.length;i++)
        {
            step++;
            if(nums[i]==tar)
            {
                System.out.println("No of steps taken from Linear :"+step);
                return i;
            }
                
        System.out.println("No of steps taken from Linear :"+step);

            
        }
        return -1;

    }
    public static int Binary(int[] nums,int tar)
    {
        int steps=0;
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            steps++;
            int mid=(l+r)/2;
            if(nums[mid]==tar)
            {
                
                System.out.println("No of steps taken from Bnary search :"+steps);
                return mid;
            }else if(nums[mid]<tar)
            {
                l=mid+1;
            }else
            {
                r=mid-1;
            }
            System.out.println("No of steps taken from Bnary search :"+steps);
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int nums[]=new int[100];
        int tar=50;
     
        int res=Linear(nums, tar); 
        int res2=Binary(nums, tar);

        if(res!=-1)
        {
            System.out.println("Linear Search:\nTarget found at the index :"+res);
        }else
        {
            //System.out.println("Element not found....");
        }

        if(res2!=-1)
        {
            System.out.println("Binary Search:\nTarget found at the index :"+res2);
        }else
        {
            System.out.println("Element not found....");
        }
    }
}
