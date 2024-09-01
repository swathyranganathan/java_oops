import java.util.Scanner;

public class Expection_throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =0;
        int j=0;
        try {
            System.out.println("enter the number");
            i= sc.nextInt();
            j=18/i;
            if(j==0)   //i is grater then 18
                throw new ArithmeticException("the input is greater then 18");
        }catch (ArithmeticException e){
            j=18/1;
            System.out.println("this is the default value and"+e);
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
        System.out.println("the answer is "+j);
    }
}
