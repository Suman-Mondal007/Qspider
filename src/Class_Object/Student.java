package Class_Object;
class Stu{
    String name;
    int roll;
    char section;
}

public class Student {
    public static void main(String[] args) {
        Stu s=new Stu();
        Stu s2=new Stu();
        s.name="Suman";
        s.roll=21;
        s.section='c';
        s2.name="Ram";
        s2.roll=22;
        s2.section='d';
        System.out.println("Name is: "+s.name+ ", Roll no is: "+ s.roll+ ", Section is: "+s.section);
        System.out.println("Name is: "+s2.name+ ", Roll no is: "+ s2.roll+ ", Section is: "+s2.section);
    }
}
