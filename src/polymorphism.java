class Bank{
    float getRAteOfIntrest(){
        return 0;
    }
}
class SBI extends Bank{
    @Override
    float getRAteOfIntrest() {
        return 8.4f;
    }
}
class ICIC extends Bank{
    @Override
    float getRAteOfIntrest() {
        return 7.3f;
    }
}
class AXIS extends Bank{
    @Override
    float getRAteOfIntrest() {
        return 9.7f;
    }
}


public class polymorphism {
    public static void main(String[] args) {
        Bank b;
        b= new SBI();
        System.out.println("sbi:"+b.getRAteOfIntrest());
        b= new ICIC();
        System.out.println("icic:"+b.getRAteOfIntrest());
        b= new AXIS();
        System.out.println("axis:"+b.getRAteOfIntrest());
        //achieved by method overriding
        //look how b behaves (it has more behaviour)
        //dynamic / runtime polymorphism


    }
}
