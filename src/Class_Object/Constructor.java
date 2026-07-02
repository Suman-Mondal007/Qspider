package Class_Object;
class Stud{
    String name;
    int roll;
    char section;
    Stud(String name,int roll, char section){
        this.name=name;
        this.roll=roll;
        this.section=section;
    }

}
public class Constructor {
    public static void main(String[] args) {
        Stud s=new Stud("Suman",60,'c');
        System.out.println("Name is: "+s.name+", Roll no is: "+s.roll+",Section is:"+s.section);
    }
}
