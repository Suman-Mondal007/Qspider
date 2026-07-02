package Array;

public class Findfreq {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,7,8,5,0,1,2,0};
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(arr[i]==-1){
                continue;
            }

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println("Count of "+arr[i]+" is: "+count);
        }

    }
}
