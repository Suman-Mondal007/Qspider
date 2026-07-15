package Abstract;

abstract class Car
{
    public abstract void drive();
}
class BMW extends Car{
    @Override
    public void drive() {
        System.out.println("Engine Working");
    }
}

public class carAbstract {
    public static void main(String[] args) {
        Car c=new BMW();
        c.drive();
    }

}
