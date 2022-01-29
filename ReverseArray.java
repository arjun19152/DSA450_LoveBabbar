public class ReverseArray {

    public static int[] solve(int array[]){
        int start=0;
        int end=array.length-1;

        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        array=solve(array);
        for(int x: array){
            System.out.println(x);
        }
    }
}
