
public class reverse {

    public static void reverse(int[] arr) {
        int half = arr.length / 2;

        int s = 0;
        int e = half - 1;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        reverse(arr);
        for(int i =0;i<arr.length/2;i++){
            System.out.println(arr[i]);
        }
    }
}