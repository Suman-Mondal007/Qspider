package Array;
public class Evenreverse {
        public static void reverse(int[] arr) {
            int s = 0;
            int e = arr.length-1;
            for (int i = 0; i < arr.length; i = i + 2) {
                while (s < e) {
                    int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                    s++;
                    e--;
                }
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

