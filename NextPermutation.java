public class NextPermutation {
    // logic:
    // start from the end, till u the condition a[i]>a[i+1], is satisified, i--
    //now start from the end , till u condition a[j]<a[i] is met
    //swap a[j] and a[i]
    //reverse from i+1 to last
    // can also be done for strings.
    public static int [] solve(int arr[]){

        int i=arr.length-2;

        while(i>=0 && arr[i]>=arr[i+1])
            i--;

        if(i>=0) {
            int j = arr.length - 1;

            while (j >= 0 && arr[j] <= arr[i])
                j--;

            //swapping
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //reversing from i+1 to arr.length-1
        int m=i+1;
        int n=arr.length-1;
        while(m<=n){
            int temp=arr[m];
            arr[m]=arr[n];
            arr[n]=temp;

            m++;
            n--;
        }

        return arr;
    }


    public static void main(String[] args) {
        int arr[]={1,5,1};
        int ans[]=solve(arr);
        for (int x: ans)
            System.out.print(x+" ");
    }

}
