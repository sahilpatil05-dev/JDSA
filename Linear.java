import java.util.*;
public class Linear
{

    public static  int linear(int[] nums,int tar)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==tar)
            {
                return i;
            }
        }

        return -1;


    }
    public static void main(String[] args) {
        

        int nums[]={23,34,56,88,90};
        int tar=78;

        int res=linear(nums,tar);

        if(res!=-1)
        {
        System.out.println("Target found on index :"+res);

        }else
        {
            System.out.println("Target not found ");
        }
}

}