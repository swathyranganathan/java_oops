import org.w3c.dom.ls.LSOutput;

class A{
    public A(){//creating a constructor
        super();
        System.out.println("In A");
    }
    public A(int n){//creating a constructor with parameter
        super();
        System.out.println("In A with parameter:"+n);
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int n){
        super(n);
        System.out.println("In B with parameter:"+n);
    }
}


public class superMethod {
    public static void main(String[] args) {
        //B obj=new B();  //output will ne "In A    In B"
        B obj=new B(5);  //output: "In A    In B with parameter:5
    }
}
