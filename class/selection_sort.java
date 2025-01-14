public class selection_sort{
    static void sort(int[]arr,int a,int b){
        a = a+b;
        b = a -b;
        a = a-b;


    }
    public static void main(String args[]){
        //here we are doing selection sort...
        //in selection sort we assume that the first element is smallest..
        int[] arr= {1,5,2,6,4,3,8,9,7,10,12,11};
        // for(int i=0;i<arr.length-1;i++){
        //     while(arr[i]>arr[i+1]){
        //         arr[i] = arr[i+1] + arr[i];
        //         arr[i+1] = arr[i] - arr[i+1];
        //         arr[i] = arr[i] - arr[i+1];
        //         --i;
                
        //     }
        // }
        int n= arr.length;
        int min = arr[0];

        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
            }


        }
        for(int v:arr){
            System.out.print(v + " ");
        }

    }
}