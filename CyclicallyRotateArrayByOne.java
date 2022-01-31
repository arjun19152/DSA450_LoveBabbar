public class CyclicallyRotateArrayByOne {
    public static int[] solve(int a[]){
        int val=a[a.length-1];

        for(int i=a.length-2;i>=0;i--){
            a[i+1]=a[i];
        }

        a[0]=val;
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int ans[]=solve(a);
        for(int x: ans){
            System.out.print(x+" ");
        }
    }
}
