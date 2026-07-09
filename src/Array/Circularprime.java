package Array;

public class Circularprime {
    public static boolean iscircularPrime(int num){
        int count=count(num);
        for(int i=1;i<=count;i++){
            if(isPrime(num)){
                int ld=num%10;
                num/=10;
                num+=ld*Math.pow(10,count-1);
            }
            else return false;
        }
        return true;
    }
    public static int count(int num){
        int count =0;
        while(num!=0){
            int ld=num%10;
            count++;
            num/=10;
        }
        return count;
    }
    public static boolean isPrime(int num) {
        int coun = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num=113;
        System.out.println(iscircularPrime(num));

    }
}
