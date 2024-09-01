package Interface;
class Car implements Engine,Brake{

    int a=56;


    @Override
    public void brake() {
        System.out.println("work normally");
    }

    @Override
    public void start() {
        System.out.println("start normally");
    }

    @Override
    public void stop() {
        System.out.println("stop normally");
    }

    @Override
    public void acc() {
        System.out.println("accelerate normally");
    }
}

public class main {
    public static void main(String[] args) {
        Car car = new Car();

        car.acc();
        car.brake();
        car.start();
        car.stop();
//        System.out.println(car.a);


        Engine obj=new Car();
        car.acc();
        car.brake();
        car.start();
        car.stop();







    }
}
