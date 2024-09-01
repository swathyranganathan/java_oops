import org.w3c.dom.ls.LSOutput;

class hello{
    public void SayHello(){
        System.out.println("Hey there!!!");
    }
}
class Two extends hello{
    public void SayHello(String a, String b){
        System.out.println("Hello squares!!!");
    }
}
class Three extends hello{
    public void SayHello(String a,String b,String c){
        System.out.println("Hello Trio!!!");
    }
}



public class polymorphism2 {
    public static void main(String[] args) {
        hello h=new hello();
        h.SayHello();
        Two t=new Two();
        t.SayHello("swathy","Harini");
        Three th =new Three();
        th.SayHello("shalini","keerthika","swathy");
        //achieved by method overloading
        //Static/Compile time polymorphism

    }
}
