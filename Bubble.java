import java.util.Arrays;

public class Bubble {

 
    public static void main(String[] args) {

        int nums[]={23,1,40,8,6,4};


        System.out.println("Original array ");
        for(int k:nums)
        {
            System.out.print(k+" ");
        }

        int iterations=0;
        for(int i=0;i<nums.length;i++)
        {
            iterations++;
            for(int j=0;j<nums.length-1;j++)
            {
                
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            System.out.println();
            for(int l:nums)
        {
            System.out.print(l+" ");
        }
        }
        
        System.out.println("\nThe number of iterations :"+iterations);
        System.out.println();
        System.out.println("The sorted array :");
        for(int l:nums)
        {
            System.out.print(l+" ");
        }
    
}
}