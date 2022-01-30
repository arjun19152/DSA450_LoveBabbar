public class Sort_0s_1s_2s {
    // three pointer method {l,m,h}====> O(N) solution
    public static int[] solve(int[] arr){
        int l=0;
        int m=0;
        int h=arr.length-1;

        while(m<=h){

            if(arr[m]==0){
                swap(arr,l,m);
                l++;
                m++;
            }
            else if(arr[m]==1)
                m++;
            else if(arr[m]==2){
                swap(arr,m,h);
                h--;
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,0,0,0,0,0,2,2,1,2};
        int[] ans=solve(arr);
        for(int x: ans){
            System.out.print(x+" ");
        }
        System.out.println();

    }
}
