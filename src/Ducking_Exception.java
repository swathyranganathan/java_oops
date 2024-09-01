class One{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Heyy");
    }
}



public class Ducking_Exception {
    public static void main(String[] args) {
        One obj=new One();
        try {
            obj.show();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class Not found");
        }

    }
}
