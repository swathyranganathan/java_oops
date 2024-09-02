
class Book implements Runnable{
    public void run() {//run

        for (int i = 0; i < 6; i++) {
            System.out.println("updating");


            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
            }

        }
    }
}
class Num extends Thread{
    public void run(){
        for (int i=0;i<6;i++){
            System.out.println(i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
            }
        }
    }
}
public class multiThread {
    public static void main(String[] args) {//thread
       // Book b = new Book()
        Runnable book =new Book();
        Num n= new Num();
        Thread t1=new Thread(book);
       // b.update();
        t1.start();// search for run
        n.run();
        System.out.println("priority "+n.getPriority());

    }
}
