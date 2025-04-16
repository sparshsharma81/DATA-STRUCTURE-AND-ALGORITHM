public class merge_sort{

    public static void merge(int[]arr,int left, int right){
        int mid = (left + right)/2;
        merge(arr,left,mid);
        merge(arr,mid+1,right);
        combine(arr,left,mid,right);

    }
    public static void combine(int[]arr,int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = mid -right;

        int[]L = new int[n1];
        int[]R = new int[n2];

        for(int i=0;i<n1;i++)L[i] = arr[left+i];
        for(int j=0;j<n2;j++)R[j] = arr[mid+j];

        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(L[i] > R[j]){
                arr[k++] = L[i++];
            }
            else{
                arr[k++] = R[j++];
                
            }
        }

    }
    public static void main(String args[]){
        //it works on the principle of divide and sort 
        // first we divide it and then merge them
        //input a sentence and print all the words that starts with a capital letter using regex

        //so baiscally in this we need to print the line with capitalize each letter using regex
        
        
    }
}