public class ExceptionHandling_TryCatch {
    public static void main(String[] args) {
        int i=0;
        int j=56;
        try {
            int k=j/i;
        }
        catch (Exception e){
            System.out.println("Something went wrong  " + e);
        }
        try {
            int k=j/2;
            System.out.println(k);
        }
        catch (Exception ob){
            System.out.println("Something went wrong");
        }
        System.out.println(j/2);

        System.out.println("  Hi hello Byee");
    }
}
