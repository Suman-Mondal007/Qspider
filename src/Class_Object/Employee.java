package Class_Object;
class Emp{
    String name;
    int age;
    String address;
    Emp(String name,int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public void Details(){
        System.out.println("Name is:"+name+ ", Age:"+age+", Address is:"+address);
    }

}
public class Employee {
    public static void main(String[] args) {
        Emp e1=new Emp("Smith",32,"Mumbai");
        Emp e2=new Emp("Allen",27,"Chennai");
        e1.Details();
        e2.Details();
    }

}
