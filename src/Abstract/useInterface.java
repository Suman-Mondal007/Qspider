package Abstract;


interface Ca{
    public abstract void drive();
}
class Audi implements Ca{
    public void drive(){
        System.out.println("Driving");
    }
}
public class useInterface {
    public static void main(String[] args) {
        Ca c=new Audi();
        c.drive();
    }
}
