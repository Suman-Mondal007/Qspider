package Array;

public class Missingnumber {
    public static void main(String[] args) {
        int arr[]={0,3,1,5,4};
        int n=arr.length;
        int sumnatural=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int miss=sumnatural-sum;
        System.out.println("Missing number:"+miss);
    }
}
