public class car {
    int passengers;
    int fuel;
    int mpg;
    int range(){
        return mpg*fuel;
    }
}
class re{
    public static void main(String[] args) {
        car minicar = new car();
        car sportcar = new car();
        int range1,range2;
        minicar.passengers=7;
        minicar.fuel=16;
        minicar.mpg=21;
        sportcar.passengers=7;
        sportcar.fuel=16;
        sportcar.mpg=21;
        //将返回值赋给变量
        range1=minicar.range();
        range2=sportcar.range();
        System.out.println("minicar can carry"+minicar.passengers+"with the range of"+range1+"miles");
        System.out.println("minicar can carry"+sportcar.passengers+"with the range of"+range2+"miles");
    }
}
