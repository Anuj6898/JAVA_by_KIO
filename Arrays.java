import java.util.*;
public class Arrays{
    public static void main (String args []){
        System.out.println("Anuj Mahendra Sonsurkar");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        if(name == "Anuj"){
            System.out.print("Hello, Admin!!");
        }
        else{
            System.out.println("Hello, nice to see you " + name);
        }
        for(int i=0;i<10;i++){
            System.out.println("Hello, "+i);
        }
        int i = 1;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }
}