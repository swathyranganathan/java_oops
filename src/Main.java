import java.util.Scanner;

       // CONCEPT OF OBJECT, CLASS, ATTRIBUTES, METHODS




class Registration{                //creating a class
    int b= 789;                    //vaiable decleared inside the class is called attributes

    public void name(){            // creating a new method named "name"
        Scanner inp=new Scanner(System.in);
        String name =inp.nextLine();
        System.out.println(name);
    }
    public String age(int a){      // creating another method named "age"
        if(a>18){
            return "Eligible";
        }
        else
            return "Not Elligible";
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Registration myobj=new Registration();   //myobj is the object created
        myobj.name();                            // calling the method "name()"
        Scanner inpp = new Scanner(System.in);
        int agee = inpp.nextInt();

         String result=myobj.age(agee);         // calling the method "age()"by passing its value
         System.out.println(result);
    }
}