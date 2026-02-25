import java.util.*;
public class Linear
{
    public static void main(String[] args) {
        

        int n[]={20,24,30,40,50};
        int target=50;

        int res=linearSearch(n,target);

        
        if(res != -1)
        {
            System.out.println("Element found :"+res);
        }else
        {
            System.out.println("Element not found");
        }

       

    }
    public static int linearSearch(int[] n ,int target)
        {

            for(int i=0;i<=n.length;i++)
            {
                if(n[i]==target)
                {
                    return i;
                }
            }
            return -1;
            
        }

    
}