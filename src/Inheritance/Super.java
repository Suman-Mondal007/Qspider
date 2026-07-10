package Inheritance;

class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Engineer extends person{
    String degree;
    String status;
    Engineer(String name,int age,String degree,String status){
        super(name, age);
        this.degree=degree;
        this.status=status;
    }
}

public class Super {
    public static void main(String[] args) {
        Engineer e=new Engineer("Suman",22,"B.tech","Pass");
        System.out.println(e.name);
        System.out.println(e.degree);

    }
}
