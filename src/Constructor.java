class Food{
    //creating a constructor with one argument
    Food (String name){
        System.out.println("Constructor1 "+"Food item="+name);
    }
    Food (String name,int quantity){
        System.out.println("Constructor2 "+"Food item= "+name+" Quantity= "+quantity);
    }
    Food(long id){
        System.out.println("Constructor3 "+"Customer ID :"+id);
    }
    Food(){
        int age= 45;
        String name="kumutha";
        System.out.println("age : "+age+"  Name : "+name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        //creating an obj
        Food obj=new Food("Biryani");
        Food obj2=new Food("dosa",5);
        Food obj3=new Food(749343);
        Food obj4=new Food();


    }
}
