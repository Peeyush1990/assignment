package Assignment1;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");  
        float a=sc.nextFloat();  
        System.out.print("Enter second number: ");  
        float b=sc.nextFloat();
        float c=a*b;
        System.out.println("Product of numbers= "+c); 
        sc.close();
    }
}