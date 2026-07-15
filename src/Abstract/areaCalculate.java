package Abstract;

abstract class Shape{
    public abstract double area();
}
class Circle extends Shape{
    double radius=5;
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Traingle extends Shape{
    double base=5,height=3;
    public double area(){
        return 0.5*base*height ;
    }
}
class Square extends Shape{
    double side=5;
    public double area() {
        return side*side;
    }
}
public class areaCalculate {
    public static void main(String[] args) {
    Shape s=new Traingle();
        System.out.println(s.area());
        s= new Circle();
        System.out.println(s.area());
        s=new Square();
        System.out.println(s.area());
    }
}
