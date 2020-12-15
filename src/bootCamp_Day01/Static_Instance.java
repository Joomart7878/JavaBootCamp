package bootCamp_Day01;

class Circle{

    public double radius; // all circle objects can have different radius
    public static double PI ; // all circle objects has same PI

    // static      sheet
    // static     properties

    static{
        PI = 3.14;
        /*
        we can use this block to set static variables even if the variables takes more than 1 step to set them
         */
    }


    public double calculateArea(){
        return PI * radius * radius;
    }

}



public class Static_Instance {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
                circle1.radius = 5;

     //   System.out.println( circle1.PI );
        System.out.println( Circle.PI );

     //   System.out.println( circle1.calculateArea() );

    }

}
