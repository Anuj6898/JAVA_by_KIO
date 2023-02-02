import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,5,4,3};
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        String [] str = new String[3];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<str.length;i++){
            str[i] = input.next();
        }
        
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.toString(str));
        String s = "anuj sonsurkar";
        char c = s.charAt(3);
        System.out.println(c);
    }
    
}
