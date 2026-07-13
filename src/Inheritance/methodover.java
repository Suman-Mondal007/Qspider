package Inheritance;
class Dem{
    public void display(){
        System.out.println("yellow");
    }
}
class Sample extends Dem{
    public void display(){
        System.out.println("Blue");
    }
}
class Frog extends Dem{

}
public class methodover {
    public static void main(String[] args) {
        Dem d=new Dem();
        d.display();
        Sample s=new Sample();
        s.display();
        new Frog().display();
    }
}

