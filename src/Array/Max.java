package Array;





    public class Max {

        public static int maximum(int[] arr) {
            int n = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (n < arr[i]) {
                    n = arr[i];
                }
            }

            return n;
        }

        public static void main(String[] args) {
            int arr[] = {10, 5, 2, 1, 3, 70, 40};

            int maxi = maximum(arr);
            System.out.println("Maximum element: " + maxi);
        }
    }



