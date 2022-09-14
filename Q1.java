package Assignment1;
import java.util.Scanner; 
public class Q1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");  
        int a=sc.nextInt();  
        System.out.print("Enter second number: ");  
        int b=sc.nextInt();   
        int c=a+b;
        int d=a-b;  
        System.out.println("Sum of numbers= "+c); 
        System.out.println("Difference of numbers = "+d); 
        sc.close();
    }
}
