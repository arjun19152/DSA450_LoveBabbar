public class DupNumInArray_NoExtraSpace_NoDistortArray {

    //floyd cycle detection algo====>For non-mutable array
    // mutating array with negative numbers====> for mutable array
    //first node will always be in a cycle component, there is no value 0 element in array (numbers are from 1 to N)
    //have 0 incoming edge.

    //[2,1,4,2,3]  ====>    2->4->3->2
    //At the intersection point x-->z-->
    //                              |
    //                              y
    // there are two incoming edges and one outgoing edge, which makes x and y to be the same
    // however times a no. repeats, the intersection node will have that many incoming edges
    // for arrays , it shouldnt contain elements starting from zero



    public static int solve(int arr[]){
        int i=arr[0];
        arr[0]=-arr[0];
        //System.out.println(i);
        while(arr[i]>0){
            //System.out.println(i);
            arr[i]=-arr[i];
            i=Math.abs(arr[i]);
        }

        return i;
    }

    public static int floydAlgo(int arr[]){

        if(arr.length==0)
            return 0;

        int slow=arr[0];
        int fast=arr[0];

        do{
           slow=arr[slow];
           fast=arr[arr[fast]];
        }while (slow!=fast);   //at least once this loop should run , thats why we use do-while loop

        slow=arr[0];

        while(fast!=slow){
            fast=arr[fast];
            slow=arr[slow];
        }

        return slow;
    }
    public static void main(String[] args) {
        int[] arr={3,1,3,4,2};
        //System.out.println(solve(arr));
        System.out.println(floydAlgo(arr));
    }
}
