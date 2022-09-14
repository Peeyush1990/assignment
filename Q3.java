package Assignment1;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the dividend: ");  
        int a=sc.nextInt();  
        System.out.print("Enter the divisor: ");  
        int b=sc.nextInt();
        int c=a/b;
        int d=a%b;
        System.out.println("The quotient is: "+c); 
        System.out.println("The remainder is: "+d);
        sc.close(); 
    }
}