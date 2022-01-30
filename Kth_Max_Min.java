public class Kth_Max_Min {

    // Quick-Select Algorithm ===> O(n), Avg. case time complexity

    public static int quickSelect(int[] arr, int lo, int hi, int k){

        int pi=partition(arr, lo, hi);

        if(k > pi){
            return quickSelect(arr, pi+1,hi,k);
        }else if (k < pi){
            return quickSelect(arr, lo, pi-1, k);
        }
        else {
            return arr[pi];
        }

    }


    public static int partition(int[] arr, int l, int h){
        int pivot=arr[l];
        int i=l;
        int j=h;

        while (i<j) {

            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if(!(j<i)){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }

        if(j<i){
            int temp=arr[l];
            arr[l]=arr[j];
            arr[j]=temp;
        }

        return j;
    }


    public static void main(String[] args) {

        int[] arr={10,16,8,12,15,6,3,9,5};
        int val=quickSelect(arr,0,arr.length-1,3);  //gives Kth smallest element. For Kth max element, put (total no. of elements-1)-(k-1)

        System.out.println(val);


    }
}
