package While;

public class Power {
    public static void main(String[] args) {
        int power=power(2,3);
        System.out.println(power);
    }
    public static int power(int a,int b){
        int value=1;
        if(b==0){
            return 1;
        }
        while(b>0){
            value*=a;
            b--;
        }
        return value;

    }
}
