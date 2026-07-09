package Array;

public class flowerbed {
    public static boolean canPlaceFlower(int []arr,int n){
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 0 && i == 0) {
                if (arr[i + 1] == 0) {
                    arr[i] = 1;
                    count++;
                }
            } else if (arr[i] == 0 && i == arr.length - 1) {
                if (arr[i - 1] == 0) {
                    arr[i] = 1;
                    count++;
                }
            } else if (arr[i] == 0) {
                if (arr[i - 1] == 0 && arr[i + 1] == 0) {
                    arr[i] = 1;
                    count++;
                }
            }
        }
        return count==n;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,0,0};
        boolean res=canPlaceFlower(arr,2);
        System.out.println(res);
    }
}