import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_TryCatch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter something:");

        try{
            int a=scan.nextInt();
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("something went wrong!!");
            scan.next();
        }
        System.out.println("bye");

        System.out.println("enter a number:");


        try{
            int i = scan.nextInt();
            int sum= 10/i;
        }
        catch (Exception oj){
            System.out.println(oj);
            System.out.println("something went wromg!");
        }
        System.out.println(" bye bye");

       int m=0;
       int n=0;
       int o=0;
        try {
            System.out.println("enter a number:");
             m=scan.nextInt();
            System.out.println("enter another number:");
             n=scan.nextInt();
            o=m/n;
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("invalid input");
        }
        catch (InputMismatchException e){
            System.out.println(e);
            System.out.println("invalid input");
        }
        //System.out.println("the answer:"+o);
        if(o!=0){
            System.out.println("the answer:"+o);
        }
    }
}
