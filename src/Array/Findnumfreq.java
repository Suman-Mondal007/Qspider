package Array;

public class Findnumfreq {
    public static void main(String[] args) {
        int arr[]={10,20,30,20,40,20,10};
        frequency(arr);
    }
    public static void frequency(int []arr){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            System.out.println("count of"+arr[i]+" is: "+count);
        }

    }
}