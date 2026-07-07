package Searching;

public class Binary {
    public static int binary(int arr[],int b){
        int start=0;
        int end=arr.length-1;
        while(end>=start){
           int  mid=(end+start)/2;
           if(arr[mid]==b){
               return mid;
           } else if (b>arr[mid]) {
               start=mid+1;
           } else  {
               end=mid-1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={8,9,10,12,15,22,27};
        System.out.println(binary(arr,10));
    }
}
