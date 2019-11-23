 class V{
        int passengers;
        int fuelcap;
        int mpg;
        //V的构造函数
        V(int p,int f,int m)
        {
            passengers=p;
            fuelcap=f;
            mpg=m;
        }
        int range()
        {
            return mpg*fuelcap;
        }
        double fuelneeded(int miles)
        {
            return (double)miles/mpg;
        }//mpg每加仑行驶英里数 fuelcap燃料 dist距离
    }
    class VehConsDemo {
        public static void main(String[] args) {
            //使用V的构造函数初始化对象
            V minivan = new V(7, 16, 21);
            V sportscar = new V(2, 14, 12);
            double gallons;
            int dist = 252;
            gallons = minivan.fuelneeded(dist);
            System.out.println("to go" + dist + "miles minivan needs" + gallons + "gallons of fuel.");
            gallons = sportscar.fuelneeded(dist);
            System.out.println("to go" + dist + "miles minivan needs" + gallons + "gallons of fuel.");
        }
    }




