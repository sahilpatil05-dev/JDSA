public class Quick {


    public static void Quicksort(int[] arr,int low,int high)
    {
        if(low<high)
        {
             int pi=part(arr,low,high);
            Quicksort(arr, low,pi-1);
            Quicksort(arr, pi+1, high);
        }
    }
    public static int part(int[] arr,int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp;

        return i+1;//to return the pivot value 
    }
    public static void main(String[] args) {


        int arr[]={23,5,17,89,43,2,1};

        System.out.println("The original Array :");
        for(int k:arr)
        {
            System.out.print(k+" ");
        }

        Quicksort(arr,0,arr.length-1);


        
        System.out.println("\nThe Sorted  Array :");
        for(int k:arr)
        {
            System.out.print(k+" ");
        }

    }
    
}