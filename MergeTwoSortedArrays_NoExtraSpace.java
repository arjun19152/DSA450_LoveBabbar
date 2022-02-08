import java.util.Arrays;

public class MergeTwoSortedArrays_NoExtraSpace {

    //we are given two sorted arrays arr1[] and arr2[]
    //So, the idea is to send the maximum element in arr1 to aar2 and bring the minimum element from arr2 to arr1.
    //This is a three pointer method

    public static void solve(int arr1[],int arr2[]){

        int i=0; //points to the first element of arr1
        int j=0; //points to the second element of arr2
        int k=arr1.length-1; //points to the largest element of arr1

        while(i<=k && j<arr2.length){

            if(arr1[i]<arr2[j])
                i++;
            else{
                int temp=arr2[j];
                arr2[j]=arr1[k];
                arr1[k]=temp;
                j++;
                k--;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }


    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={0,2,6,8,9};

        solve(arr1,arr2);

        for(int x: arr1)
            System.out.println(x);

        for (int x:arr2)
            System.out.println(x);
    }
}
