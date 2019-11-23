public class sz1{
    public static void main(String[] args) {
        int nums[][]={
                {1,1},
                {2,4},
                {3,9},
                {4,16},
                {5,25},
                {6,36},
                {7,49}
        };
        int i,j;
        for (i=0;i<7;i++){
            for (j=0;j<2;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}