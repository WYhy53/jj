
   /* class atest{
        void noChange(int i,int j){
            i=i+j;
            j=-j;
        }
    }
    public class notchange {
        public static void main(String[] args) {
          atest ob =new atest();
          int a=15,b=20;
            System.out.println("a and b before call:"+a+" "+b);
            ob.noChange(a,b);
            System.out.println("a and b after call:"+a+" "+b);
        }
    }*/
   class atest{
       int a,b;
      /* atest(int i,int j){构造函数，使得可以在定义对象时就初始化对象
           a=i;
           b=j;
       }*/
       void change(atest ob){
           ob.a=ob.a+ob.b;
           ob.b=-ob.b;
       }
   }
   class passobref{
       public static void main(String[] args) {
           atest ob=new atest();
            ob.a=15;
            ob.b =20;
            //atest ob=new atest(15,20);
           System.out.println("ob.a and ob.b before call:"+ob.a+" "+ob.b);
           ob.change(ob);
           System.out.println("ob.a and ob.b before call:"+ob.a+" "+ob.b);
       }
   }



