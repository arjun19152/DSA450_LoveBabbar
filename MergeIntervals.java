import sun.awt.image.ImageWatched;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {
    /// Solution using Comparator===>When u use third party classes which doesn't implement Comparable
    public int[][] merge(int[][] intervals) {

        if(intervals.length<=1)
            return intervals;

        LinkedList<int []> list=new LinkedList<>();
        for(int i=0;i<intervals.length;i++){
            list.add(intervals[i]);
        }

        Comparator<int[]> com=new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[0]>o2[0])
                    return 1;
                else if(o1[0]<o2[0])
                    return -1;
                else{
                    if(o1[1]>o2[1])
                        return 1;
                    else if(o1[1]<o2[1])
                        return -1;

                    return 0;
                }
            }
        };

        Collections.sort(list,com);

        int [] beingComp=list.get(0);
        LinkedList<int[]> nlist=new LinkedList<>();
        for(int i=1;i<list.size();i++){
            if(beingComp[1]>=list.get(i)[0]){
                if(beingComp[1]<list.get(i)[1])
                    beingComp[1]=list.get(i)[1];
            }
            else {
                nlist.add(beingComp);
                beingComp = list.get(i);
            }
        }
        nlist.add(beingComp);

//        for(int x[]:nlist){
//            System.out.println(x[0]+","+x[1]);
//        }

        int[][] ans= new int[nlist.size()][2];
        for(int i=0;i<nlist.size();i++){
            ans[i][0]=nlist.get(i)[0];
            ans[i][1]=nlist.get(i)[1];}

        return ans;
    }

    public static void main(String[] args) {
        int [][]intervals = {{1,4},{2,3}};//{{2,6},{15,18},{8,10},{1,3}};
        MergeIntervals obj=new MergeIntervals();
        int ans[][]=obj.merge(intervals);

        for(int i=0;i<ans.length;i++)
            System.out.println(ans[i][0]+","+ans[i][1]);

    }
}
