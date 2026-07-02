package Array;

public class Findcharfreq {
    public static void main(String[] args) {
        String arr[]={"h","e","l","l","o"};
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(arr[i].equals("*")){
                continue;
            }

            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    arr[j]="*";
                }
            }
            System.out.println("Count of "+arr[i]+" is: "+count);
        }

    }
}


/*
public class Demo{
public static void main(string[] args){
string str="hello";
frequency(str);
}
public static void frequency(String astr){
int []arr=new int [26];
for int i=0;i<arr.length;i++){
char ch=str.charAt(i);
arr[ch-97]++;
}
 */
