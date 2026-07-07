package Class_Object;
 class emplo{
     private String name="Ram";
     private int e_id=101;
     private double salary=50000;
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name=name;
     }
     public int gete_id(){
         return e_id;
     }
     public void sete_id(int e_id){
         this.e_id=e_id;
     }
     public double getsallery(){
         return salary;
     }
     public void setsalary(double salary){
         this.salary=salary;
     }
}
public class encapsulation {
    public static void main(String[] args) {
        emplo e1=new emplo();
        System.out.println(e1.getName()+" " +e1.gete_id()+" " +e1.getsallery());
        e1.setName("Suman");
        e1.sete_id(105);
        e1.setsalary(70000);
        System.out.println(e1.getName()+" "+e1.gete_id()+" "+e1.getsallery());
    }
}
