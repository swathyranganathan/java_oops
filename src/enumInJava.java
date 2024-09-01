import com.sun.jdi.PathSearchingVirtualMachine;

enum Status{
    RUNNING,FAILED,SUCCESS,PENDIG;
}


public class enumInJava {
    public static void main(String[] args) {

        Status[] op=Status.values();
        for (Status o:op){
            System.out.println(o.ordinal()+":"+o);
        }


        Status s=Status.RUNNING;
        System.out.println(s);

        if(s==Status.SUCCESS)
            System.out.println("Done");
        else if (s==Status.RUNNING)
            System.out.println("Almost Done");
        else if (s==Status.PENDIG)
            System.out.println("Please wait");
        else
            System.out.println("Sorry!");


        Status t=Status.FAILED;
        switch (t){
            case FAILED ->
                System.out.println("Sorry!");
            case PENDIG -> System.out.println("Please wait");
            case RUNNING -> System.out.println("Almost done");
            case SUCCESS -> System.out.println("done");

        }
    }
}
