import java.util.Scanner;

class DivisionExample{
    public void divideNumber(int n, int m){
        int result=0;
        try{
            result=n/m;
            System.out.println("result is : "+result);
        }catch (ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);

    }
}
class AgeValidator{
    public void checkAge(int age){
        try{
            if(age<0 || age>150){
                throw new InvalidAgeException("Age is invalid");
            }
            else {
                System.out.println("valid age");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
public class pract_exceptionHandling {
    public static void main(String[] args) {
        System.out.println("enter two number:");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        DivisionExample d1 = new DivisionExample();
        d1.divideNumber(num1, num2);

        System.out.println("enter age: ");
        int age = sc.nextInt();
        AgeValidator a=new AgeValidator();
        a.checkAge(age);
    }
}
