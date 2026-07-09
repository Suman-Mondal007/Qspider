package Class_Object;

import javax.crypto.spec.PSource;

class person{
    String name;
    int age;
    person(){

    }
    person(String name){
        this.name=name;
    }
    person(int age){
        this.age=age;
    }
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class Constructoroverloading {
    public static void main(String[] args) {
        person p=new person(45);
        System.out.println(p.age);
    }
}
