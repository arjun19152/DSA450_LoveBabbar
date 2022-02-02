public class Minimum_No_Of_Jumps_To_Reach_End_OfArray {
    // faster algorithm than O(N^2) approach.====> O(N) approach
    public static int solve(int[] arr, int n){

        int maxReach=arr[0];
        int step=arr[0];
        int jump=1;

        if(n==1)
            return 0;
        else if(arr[0]==0)
            return -1;
        else{

            for(int i=1;i<n;i++){
                if(i==n-1)
                    return jump;

                maxReach=Math.max(maxReach,i+arr[i]);
                step--;

                if(step==0){
                    jump++;
                    if(i>=maxReach){
                        return -1;
                    }

                    step=maxReach-i;
                }
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        int arr[]={1,3,5,8,9,2,6,7,6,8,9};

        System.out.println(solve(arr,arr.length));
    }
}
