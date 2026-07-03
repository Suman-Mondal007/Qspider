package While;

public class Happynumber {
    public static int sum(int num){
        int sum=0;
        while (num!=0){
            int ld=num%10;
            sum+=ld*ld;
            num/=10;
        }
        return sum;
    }
    public static boolean isHappy(int num){
        int sum=0;
        while(num>9){
            sum=sum(num);
            num=sum;
        }
        return num==1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
