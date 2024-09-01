@FunctionalInterface
interface sum{
    void ShowSum(int i,int j);
   //abstract int Multi(int i,int j);
    /* if you un comment this line you get error
       because it is an FunctionalInterface which means allow only one method*/
}



public class LambdaExpression {
    public static void main(String[] args) {
        sum obj= (int i,int j) ->
        {
            System.out.println("the sum "+(i+j));
        };
       obj.ShowSum(5,7);
    }

    }

