package Calculator;

import Calculator.Calc.PowCalc;

public class inheritance {
    public static void main(String[] args) {
        PowCalc obj=new PowCalc();
        int add=obj.add(4,3);
        int sub=obj.sub(9,7);
        int multi=obj.multi(4,6);
        int division=obj.div(23,4);
        int modulo=obj.mod(45,9);
        int power=obj.power(2,4);
        System.out.println("the addition : "+" "+add);
        System.out.println("the subtraction : "+" "+sub);
        System.out.println("the multiple : "+" "+multi);
        System.out.println("the division : "+" "+division);
        System.out.println("the modulus : "+" "+modulo);
        System.out.println("the power : "+" "+power);

    }
}
