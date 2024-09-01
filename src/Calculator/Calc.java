package Calculator;

public class Calc {
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }

    public static class PowCalc extends AdvCalc {
        public int power(int n, int m){
            return (int)Math.pow(n,m);
        }
    }
}
