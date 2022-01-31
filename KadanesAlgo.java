public class KadanesAlgo {

    public static int solve(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for (int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];

            if(currSum>maxSum)
                maxSum=currSum;

            if (currSum<0)
                currSum=0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,-2,5};
        System.out.println(solve(arr));
    }
}
