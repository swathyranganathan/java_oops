class Abc implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){}
        }
    }
}


public class Runnable_Threads {
    public static void main(String[] args) {
        //A obj= new A();
        Runnable obj = new Abc();

        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        Thread t1 = new Thread(obj);
        t1.start();

        Thread t2 = new Thread(obj2);
        t2.start();
    }
}

