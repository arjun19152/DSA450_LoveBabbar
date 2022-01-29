public class MaxMinArray_TournamentMethod {
    public class Pair{
        int max;
        int min;
    }

    public Pair solve(int[] array, int low, int high){

        Pair minmax=new Pair();
        Pair mml=new Pair();
        Pair mmr=new Pair();


        if(low == high){
            minmax.min=array[low];
            minmax.max=array[high];
            return minmax;
        }

        if(high == low+1){
            if(array[high]>array[low]){
                minmax.max=array[high];
                minmax.min=array[low];
            }else{
                minmax.max=array[low];
                minmax.min=array[high];
            }

            return minmax;
        }


        int mid=(low+high)/2;
        mml=solve(array,low,mid);
        mmr=solve(array,mid+1,high);

        if(mml.min<mmr.min)
            minmax.min= mml.min;
        else
            minmax.min= mmr.min;


        if(mml.max>mmr.max)
            minmax.max= mml.max;
        else
            minmax.max= mmr.max;

        return minmax;

    }


    public static void main(String[] args) {
        int[] array={1000,800,950,6,12,234};
        MaxMinArray_TournamentMethod ob=new MaxMinArray_TournamentMethod();
        Pair obj=ob.new Pair();

        obj= ob.solve(array,0,array.length-1);

        System.out.println(obj.max);
        System.out.println(obj.min);
    }
}
