public class merge {
    public static void mergesort(int[] arr,int l,int r)
    {

        if(l<r)
            {      int mid=(l+r)/2;
            mergesort(arr, l, mid);
            mergesort(arr,mid+1,r);
            mergeArrays(arr, l, mid,r);
            }
     
        
    }

    public static void mergeArrays(int[] arr,int l,int mid,int r)
    {

        int b1=mid - l + 1;//2-0+1=3; total first 3 array elements;
        int b2=r-mid;//5-2=3  total last 3 array elements;
        int larr[]=new int[b1];
        int rarr[]=new int[b2];   

        for(int x=0;x<b1;x++)
        {
            larr[x]=arr[l+x];//0,1,2
        }
        for(int x=0;x<b2;x++)
        {
            rarr[x]=arr[mid+1+x];//3,4,5
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<b1 && j<b2)
        {
            if(larr[i]<=rarr[j])
            {
                arr[k]=larr[i];
                i++;
            }else
            {

                arr[k]=rarr[j];
                j++;
            }
            k++;
        }

        while(i<b1)
        {
            arr[k]=larr[i];
            i++;
            k++;
        }

        while(j<b2)
        {
            arr[k]=rarr[j];
            j++;
            k++;
        }
        
    }
    public static void main(String[] args) {
        
        int arr[]={8,5,9,1,6,7};

        System.out.println("Original array:");
        for(int g:arr)
        {
            System.out.print(g+ " ");
        }

        mergesort(arr,0,arr.length-1);

        System.out.println("\nSorted array:");
        for(int g:arr)
        {
            System.out.print(g+ " ");
        }
    }
}
