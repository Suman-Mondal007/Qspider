package Class_Object;

class SimCard{
    String net;
    int number;
    SimCard(String net, int number){
    this.net=net;
    this.number=number;
    }
}
class Phone{
    String brand;
    double price;
    int camera;
    SimCard slot;
    Phone(String brand,double price,int camera){
        this.brand=brand;
        this.price=price;
        this.camera=camera;
    }
    public void createSim(String net,int number){
        slot=new SimCard(net,number);
    }
}
public class Lazyinstantiation {
    public static void main(String[] args) {
        Phone p=new Phone("APPLE",50000,2);
        System.out.println(p.brand);
        p.createSim("Airtel",215468);
        System.out.println(p.slot.net);
    }
}
