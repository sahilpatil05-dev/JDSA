public class Selectionsort {
    public static void main(String[] args) {
        
        int nums[]={6,5,2,8,9,4};
        int small=0;
            System.out.println("Original array :");
            for(int k:nums)
            {
                System.out.print(k+" ");
            }

            for(int i=0;i<nums.length-1;i++)
            {
                small=i;
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[small]>nums[j])
                    {
                        small=j;
                    }
                }
                int temp=nums[small];
                nums[small]=nums[i];
                nums[i]=temp;
            }
            

            System.out.println();
             System.out.println("Sorted array :");
            for(int k:nums)
            {
                System.out.print(k+" ");
            }

    }
    
}
