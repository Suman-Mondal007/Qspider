package Searching;

public class linear {
    public static void main(String[] args) {
        int arr[]= {3,5,7,2,1,8};
        int search=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println(i);
            }
        }
    }
}
