
      /*METHOD OVERLOADING
            "add()" is the only method used here
               according to the input it choose the crt method*/

class Addition{
    public int add(int n1, int n2, int n3){
        int adds=n1+n2+n3;
        return adds;
    }
    public int add(int n1, int n2){
        int adds=n1+n2;
        return adds;
    }
    public double add(double n1, double n2, double n3){
        double adds=n1+n2+n3;
        return adds;
    }
}


public class method_overloading {
    public static void main(String[] args) {
       Addition obj=new Addition();

        int res1 =obj.add(4,8,9);
        System.out.println(res1);

        int res2 =obj.add(4,9);
        System.out.println(res2);

        double res3 =obj.add(4.90,0.8,9.98);
        System.out.println(res3);



    }
}
