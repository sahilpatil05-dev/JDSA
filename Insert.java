public class Insert {
    public static void main(String[] args) {
        

        int nums[]={23,4,68,9,12};

        

        System.out.println("The original array :");
        for(int k:nums)
        {
            System.out.print(k+" ");
        }
        int steps=0;

        for(int i=1;i<nums.length;i++)
        {
            steps++;
            int key=nums[i];
            int j=i-1;
            while ( j>=0 && nums[j]>key) {

                nums[j+1]=nums[j];
                j=j-1;
                
            }
            nums[j+1]=key;
        }



         System.out.println("\nThe Sorted  array :");
        for(int k:nums)
        {
            System.out.print(k+" ");
        }

        System.out.println("\nNumber of Iterations  :"+steps);
    }
    
}
