abstract class Square{

    public void GeneralPrint(){
        System.out.println("Measuring the area....");
    }
     abstract void SquareArea();
}
class Shape extends Square {

    public void RectangleArea(){
        System.out.println("Area of Rectangle");
    }

    public void SquareArea(){
            System.out.println("Area of Square");
        }
    }



public class AbstractKeyword {
    public static void main(String[] args) {
        Square s= new Shape();

        s.GeneralPrint();
        s.SquareArea();
        Shape ss= (Shape)s;
        ss.RectangleArea();

    }
}
