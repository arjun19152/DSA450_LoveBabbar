public class MedianINrowSortedMatrix {

    public static int median(int matrix[][], int r, int c) {
        // code here
        // aadhe elements chote aur aadhe elements bade hone chahiye

        int startVal=0, endVal=2000, midVal;
        int n=(r*c);

        while (startVal<=endVal){

            midVal=(startVal+endVal)/2;
            int ans=0;

            for(int i=0; i<r; i++){
                int l=0;
                int h=c-1;

                while (l<=h){
                    int m=l+(h-l)/2;

                    if(matrix[i][m]<=midVal)
                        l=m+1;
                    else
                        h=m-1;
                }

                ans+=l;
            }

            if (ans<=n/2)
                startVal=midVal+1;
            else
                endVal=midVal-1;
        }

        return startVal;
    }

    public static void main(String[] args) {

        int r=3;
        int c=3;

        int matrix[][]={{1,3,5}, {2,6,9}, {3,6,9}};

        System.out.println(median(matrix,r,c));

    }
}
