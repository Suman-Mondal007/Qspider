package While;

public class Findfrequency {
    public static void main(String[] args) {
        long num=12317850120135L;
        frequency(num);
    }
    public static void frequency(long num){
        int arr[]=new int[10];
        while(num!=0){
            int ld=(int)(num%10);
            arr[ld]++;
            num/=10;
        }
        for(int i =0;i<arr.length;i++){
            System.out.println("Count of "+i+" is: "+arr[i]);
        }
    }
}
