class Parent{
    String name;
    void method(){
        System.out.println("In Parent Class");
    }
}
class Child extends Parent{
    int n;
    void mehtod(){
        System.out.println("In Child Class");
    }
}


public class UpCasting_DownCasting {
    public static void main(String[] args) {
        //upcasting
        Parent p=(Parent) new Child(); //(Parent)will be there if you even didn't mention
        p.name="Ramasamy";
        System.out.println(p.name);
        p.method();



        //downcasting
        Child c=(Child)p; /*mention Child*/
        c.n=34;
        System.out.println(c.name);
        System.out.println(c.n);
        c.mehtod();
    }
}
