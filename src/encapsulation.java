class person{
    //Encapsulating the name and age
    private int age;
    private String name;
    //concept of getter and setter
    public void setAge(int age){
        this.age=age; //using of this keyword - refer to the current object in a method
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        //obj object created
        person obj= new person();
        obj.setAge(16);
        obj.setName("karthik");

        System.out.println(obj.getName()+": "+obj.getAge());

    }
}
