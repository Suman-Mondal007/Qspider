package Class_Object;


class Engine{
    int hp;
    int torque;
    Engine(int hp,int torque){
        this.hp=hp;
        this.torque=torque;
    }
}
 class Car{
    String brand;
    double price;
    Engine e;
    Car(String brand,double price,int hp,int torque){
        this.brand=brand;
        this.price=price;
        e=new Engine(hp,torque);
    }
}
public class Hasarelation {
    public static void main(String[] args) {
        Car c=new Car("BMW",1000,1600,300);
        System.out.println(c.brand);
        System.out.println(c.e.hp);
    }
}
