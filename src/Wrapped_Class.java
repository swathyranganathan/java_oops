import java.util.ArrayList;

public class Wrapped_Class {
    public static void main(String[] args) {
        int num=23;
        System.out.println("primitive: "+num);
        Integer num1=num;  //autoboxing
        System.out.println("Autoboxing: "+num1);
        int num2=num1;  //autounboxing
        System.out.println("AutoUnboxing: "+num2);

        char ch='a';
        Character ch1=ch;
        System.out.println(ch1);
        char ch2=ch1;
        System.out.println(ch2);



        //converting String to Integer
        String str="34";
        int num3= Integer.parseInt(str);
        System.out.println("Str to Int :" + num3*2);

    }
}
