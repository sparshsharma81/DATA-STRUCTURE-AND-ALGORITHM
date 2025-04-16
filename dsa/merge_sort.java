public class merge_sort{
    public static void merge(int[]arr,int left , int right){
        if(left < right){
            int mid = (left + right)/2;
            merge(arr,left,mid);
            merge(arr,mid+1,end);
            combine(arr,left,mid,end);
        }
    }
    public static void combine(int[]arr,int left,int mid,int right){
        int n1 = mid - left+1;
        int n2 = mid - right;
        int[]L = new int[n1];
        int[]R = new int[n2];

        for(int i=0;i<n1;i++)L[i] = arr[left+i];
        for(int j=0;j<n2;j++)R[j] = arr[mid+j+1];


        //now we have merged the array..
        ///now we will merge the unsorted part of the array..
        int i=0,r=0,k=left;

        while(i<n1 && j<n2){
            if(L[i] <=R[i]){
                arr[k++] = L[i++];
            }
            else
            arr[k++] = R[j++];
        }

        //now since we have copied the elements and one of the array can be empty;
        while(i<n1)arr[k++] = L[i++];
        while(j<n2) arr[k++] = R[j++];

    }
    public static void main(String args[]){
        //merge sort --- we just split the array
    }
}