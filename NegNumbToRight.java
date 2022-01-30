public class NegNumbToRight {
    // using two pointer method as in partition algorithm.
    public static void solve(int arr[]){
        int i=0;
        int j= arr.length-1;

        while(i<j){

            while(arr[i]<0)
                i++;

            while(arr[j]>0)
                j--;

            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,-3,-4,34,21,9,-4,-55,6,-100-200,-900,-77,-66,-59,-88};
        solve(arr);
        for(int x:arr){
            System.out.println(x);
        }
    }
}
