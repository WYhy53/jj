public class wsj {
    public static void main(String[] args) {
        candy candy1=new candy();
        dress dress1=new dress();
        child child1=new child();
        dress1.number=10;
        dress1.singleprice=100;
        int zongjia;
        zongjia=dress1.number*dress1.singleprice;
        child1.trick();
        child1.play();
        candy1.getprice(20);
        candy1.getname("小糖糖");
        System.out.println("衣服总价是"+zongjia);
    }

}
class candy {
    int price;
    String name;

    void getprice(int price) {
        System.out.println("这个糖果价格是" + price);
    }

    void getname(String name) {
        System.out.println("这个糖果的名字是");
    }
}
class child{
   void trick(){
       System.out.println("不给糖就捣蛋！");
   }
   void play(){
       System.out.println("或者和我一起玩。");
   }
}
class dress{
    int singleprice;
    int number;
}
