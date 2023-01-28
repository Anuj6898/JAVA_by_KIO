// Given : String to be calculated. (Eg. 1233 + 234, 13243 - 234, 897 * 2343, & 239 / 33)
// Functions : Main,
//              Splitting,(Split the String into 3 parts i.e Num1, Num2 and Symbol/Operator)
//               Calculation,(Applying Switch Case for given Operation)
//                Add, 
//                Subtract, 
//                Multiply, 
//                Divide


import java.util.*;

public class Calculator{
    public static void main(String[] args) {
        System.out.println(" --- Calculator App --- ");
        Scanner input = new Scanner(System.in);
        String problem = input.nextLine();
        Splitting(problem);
    }

    public static void Splitting(String problem){
        int sindex = 0, x=0,y=0;
        char symbol = ' ';
        for(int i=0;i<problem.length();i++){
                    if( problem.charAt(i) == ' '){
                        continue;
                    }
                    if(sindex != 0){
                        y = y*10 + Character.getNumericValue(problem.charAt(i));
                    }
                    if( problem.charAt(i)=='+' || problem.charAt(i)=='-' || problem.charAt(i) == '*' || problem.charAt(i) == '/' ){
                        symbol = problem.charAt(i);
                        sindex = i;
                    }
                    if(sindex == 0){
                        x = x*10 + Character.getNumericValue(problem.charAt(i));
                    }    
                }
                Calculation(symbol,x,y,problem);
    }

    public static void Calculation(char s,int x,int y, String problem){
        switch(s){
            case '+':
                Add(x,y,problem);
                break;
            case '-':
                Subtract(x,y,problem);
                break;
            case '*':
                Multiply(x,y,problem);
                break;
            case '/':
                Divide(x,y,problem);
                break;
            default:
                break;
        }
    }

    public static void Add(int a, int b, String prob){
        int c = a + b;
        System.out.println("Result: ");
        System.out.println(prob+" = "+ c);
    }
    public static void Subtract(int a, int b, String prob){
        int c = a - b;
        System.out.println("Result: ");
        System.out.println(prob+" = "+ c);
    }
    public static void Multiply(int a, int b, String prob){
        int c = a * b;
        System.out.println("Result: ");
        System.out.println(prob+" = "+ c);
    }
    public static void Divide(int a, int b, String prob){
        float c = a / b;
        System.out.println("Result: ");
        System.out.println(prob+" = "+ c);
    }
}