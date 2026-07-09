package Inheritance;


class Doctor{
    String name;
    int exp;
    String spec;
    void prescribe(){
        System.out.println("Prescribe");
    }
    void checkBP(){
        System.out.println("Check");
    }
}
class Cardiologist extends Doctor{
    int surgeries;
    void heartOP(){
        System.out.println("HEart");
    }
}
public class Demo {
    public static void main(String[] args) {
        Cardiologist c=new Cardiologist();
        System.out.println(c.name);
        c.heartOP();

    }
}
