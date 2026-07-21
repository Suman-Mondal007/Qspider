package exception;

import java.util.Scanner;
public class arraycheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        try{ // we can have muotiple catch block for one try block
            int n=sc.nextInt();
            int [] arr=new int[n];
            System.out.println(arr[0]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index issue!!");
        }
        catch(NegativeArraySizeException e){
            System.out.println("Negetive size!!");
        } catch (Exception e) {
            System.out.println("Unknown error!!");
        }// generic catch block should be at the last
    }
}
