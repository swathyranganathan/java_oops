class Greet {
    public void SayHello() {
        System.out.println("HELLO");
    }

    class Welcome {
        public void WelcomeEveryone() {
            System.out.println("WELCOMING EVERYONE!!");
        }
    }
}


// to understand the concept of Anonymous Inner Class
class Ano{
    public void SaySomething() {
        System.out.println("I am ------");
    }
}

//Abstract in Anonymous Inner Class
abstract class Flower{
    public abstract void lily();
    public abstract void jasmine();
}




public class innerClass {
    public static void main(String[] args) {
        Greet h = new Greet();//creating object of class hello
        h.SayHello();

        //CREATING OBJECT OF INNER CLASS

        Greet.Welcome obj = h.new Welcome();  //where the welcome class is inside the class hello
        obj.WelcomeEveryone();


        // understanding the concept of anonymous class

        Ano ano = new Ano() {

            public void SaySomething() {
                System.out.println("I am a anonymous inner class");
            }
        };
        ano.SaySomething();



//Abstract in Anonymous Inner Class
        Flower f= new Flower()
        {
            public void lily() {
                System.out.println("Hey!! I am lilyyyyyyyyy");
            }

            public void jasmine(){
                System.out.println("Hey!! I am Jasmineeeeee");
            }
        };
        f.lily();
        f.jasmine();
    }
}
