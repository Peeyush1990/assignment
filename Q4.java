package Assignment1;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");  
        int a=sc.nextInt();  
        System.out.print("Enter second number: ");  
        int b=sc.nextInt();

        //with using temp variable
        int temp=a;
        a=b;
        b=temp;
        System.out.println("First No. : "+a); 
        System.out.println("Second No. : "+b); 

        //without using temp variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("First No. : "+a); 
        System.out.println("Second No. : "+b);
        sc.close(); 
    } 
}