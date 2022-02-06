import java.util.ArrayList;
import java.util.List;

public class BucketProblem {

    public static int FilledBuckets(int N, List<Integer> queries) {
        // Write your code here

        int totalAns=0;
        int even=0;
        int odd=0;
        for (int i = 0; i < queries.size(); i++) {
            int m=queries.get(i);
            if(m==1){
                totalAns=N;
                even=N/2;
                if(N%2!=0)
                    odd=N/2+1;
                else
                    odd=N/2;
            }else if(m==2){
                if(even!=0){
                    totalAns-=even;
                    even=0;
            }else if(m==3){
                    if(odd!=0) {
                        totalAns -= odd;
                        odd = 0;
                    }
            }else if(m==4){
                totalAns=0;
                even=0;
                odd=0;
            }
        }
    }
        return totalAns;
}


    public static void main(String[] args) {
        List<Integer> queries=new ArrayList<Integer>();
        queries.add(1);queries.add(2);queries.add(2);
        System.out.println(FilledBuckets(5,queries));
    }
}
