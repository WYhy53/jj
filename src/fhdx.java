class Err{
    String msg;
    int severity;
    Err(String m,int s){
        msg=m;
        severity=s;
    }
}
class errinfo{
    String msgs[]={
            "lala",
            "baba",
            "eheh",
            "buu"
    };
    int how[]={2,6,8,3,5};
    Err geterrinfo(int i){
        if(i>=0 & i<msgs.length)
            return new Err(msgs[i],how[i]);
        else
            return new Err("cuowu",0);
    }
}
public class fhdx {
    public static void main(String[] args) {
        errinfo err =new errinfo();
        Err e;
        e=err.geterrinfo(2);
        System.out.println(e.msg+" "+e.severity);
        e=err.geterrinfo(19);
        System.out.println(e.msg+" "+e.severity);

    }


}
