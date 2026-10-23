import java.util.*;
public class leet13 {
    
    public  int per(int[] nums)
    {
        int k=0;
        
        for (int i = 0; i < nums.length; i++) {
    if (nums[i] != i) {
        k = nums[i] & i;
    }
    
}
    return k;    
        
    }
    public static void main(String[] args) {
        
        int[] nums={0,3,2,1};
        leet13 ob=new leet13();
        System.out.println(ob.per(nums));
    }
}
