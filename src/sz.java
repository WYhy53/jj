public class sz {
    public static void main(String[] args) {
        int batter[]={1,3,5,7,9};
        //int batter[]=new int[5];
        int min,max;
        min=max=batter[0];
        for(int i=0;i<5;i++){
            if(batter[i]<min) min=batter[i];
            if(batter[i]>max) max=batter[i];
        }
        System.out.println("min and max:"+min+" "+max);
    }
}
