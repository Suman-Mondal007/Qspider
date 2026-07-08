package While;

public class Evilnumber {
    public static boolean isEvil(int num){
        int count=0;
        while(num!=0){
            if(num%2==1){
                count++;
            }
            num/=2;
        }
        return count%2==0;
    }

    public static void main(String[] args) {
        int num=8;
        System.out.println(isEvil(num));
    }
}
