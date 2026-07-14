package Array;

public class Countnumber {

    public static boolean isprime(int cn) {
        if (cn < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(cn); i++) {
            if (cn % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = {8, 4, 7, 2, 4, 8, 8, 8};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (isprime(count)) {
                System.out.println(arr[i] + " occurs " + count + " times (Prime Count)");
                break;
            }
        }
    }
}