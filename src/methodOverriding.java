class Add{
    public int add(int n, int m){
        return n+m;
    }
}
class plusOne extends Add{
    public int add(int n, int m){
        System.out.println("I am plusOne ");
        return n+m+1;
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        plusOne obj=new plusOne();
        int result= obj.add(3,5);
        System.out.println("result:" + result);

    }
}
