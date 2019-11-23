
    class my {
        int alpha;

        void setalpha(int a) {
            alpha = a;
        }
        int getAlpha(){
            return alpha;
        }
    }
      public class demo1{
          public static void main(String[] args) {
              my aa = new my();
              int c;
              aa.setalpha(99);
              System.out.println("alpha is:"+aa.getAlpha());
          }
      }


