public class RecursionBinary {
    

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
            }else
            {
                return Linear(nums, tar);
            }
                
     //   System.out.println("No of steps taken from Linear :"+step);

            
        }
        return -1;

    }
    public static int Binary(int[] nums,int tar, int l, int r)
    {
        int steps=0;
        if(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==tar)

                {
                    steps++;
                    System.out.println("Steps taken :"+steps);
                    return mid;
            
        }else if(nums[mid]<tar)
        {
            // steps++;
            // System.out.println("Steps taken :"+steps);
            return Binary(nums, tar,mid+1, r);
        }else
        {
            // steps++;
            // System.out.println("Steps taken :"+steps);
            return Binary(nums, tar, l, mid-1);
        }
       
    }
    System.out.println("Steps taken :"+steps);
    return  -1;
    }
    public static void main(String[] args) {
        int nums[]=new int[500];
        int indx=(int)(Math.random()*nums.length);
        int tar=nums[indx];
     
        int res=Linear(nums, tar); 
        int res2=Binary(nums, tar,0,nums.length-1);

        if(res!=-1)
        {
            System.out.println("Linear Search:\nTarget found at the index :"+res);
        }else
        {
            System.out.println("Element not found....");
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
