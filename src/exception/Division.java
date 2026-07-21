package exception;


import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Two number:");
        int a=1,b=1;
        try {
            a = sc.nextInt();
            b = sc.nextInt();
        }
        catch (Exception e){   //generic catch block
            System.out.println("Input handled");
        }
        try{
            int res=a/b;
            System.out.println("result= "+res);
        }
        catch (ArithmeticException e){  // specific catch block
            System.out.println("Divide by zero");
        }
    }
}
