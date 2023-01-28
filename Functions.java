import java.util.Scanner;

public class Functions {
    public static void main (String args[]){
        System.out.println("Enter two integers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        sum(a,b);
    }
    
    public static void sum(int num1, int num2){
        int num3 = num1 + num2;
        System.out.println("Therfore the sum of both numbers is : "+num3);
    }
}
