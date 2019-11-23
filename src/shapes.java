class TwoDshape{
    double width;
    double height;
    void showDim(){
        System.out.println("Width and height are"+width+"and"+height);
    }
}
class Triangle extends TwoDshape{
    String style;
    double area(){
        return width*height/2;}
        void showstyle(){
            System.out.println("Triangle is"+style);
        }
    }
public class shapes {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.height=4.0;
        t1.width=4.0;
        t1.style="filled";
        System.out.println("Info for t1:");
        t1.showstyle();
        t1.showDim();
        System.out.println("Area is"+t1.area());
    }
}
