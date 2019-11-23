 class Phone {
    public static void main(String[] args) {
        String numbers[][]={
                {"tom","555-3322"},
                {"mary","555-8976"},
                {"jon", "1122"},
                {"rachel","2233"}
        };
        int i;
        if(args.length !=1)
            System.out.println("usage:java phone <name>");
        else{
            for(i=0;i<numbers.length;i++){
                if(numbers[i][0].equals(args[0])){//如果找到了所匹配的人，则显示该人的电话号码
                    System.out.println(numbers[i][0]+":"+numbers[i][1]);
                    break;
                }
            }
            if(i==numbers.length)
                System.out.println("name not found");
        }
    }
}
