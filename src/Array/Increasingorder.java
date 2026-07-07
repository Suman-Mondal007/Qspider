package Array;

public class Increasingorder {
    public static void main(String[] args) {
        int num = 12345;
        int fd=10;
        while (num != 0) {
            int ld=num%10;
            if(fd>ld){
                System.out.println("T");
            }
            fd=ld;
            num/=10;
        }
    }
}
