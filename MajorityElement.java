
import java.util.*;

public class MajorityElement{
    public static void main(String [] args){
        int [] arr = {2,2,3,3,3,2,2};
        System.out.println(majorityElement(arr));        
       
    }
    public static int majorityElement(int []arr){
        int maxele=0;
        HashMap<Integer, Integer> x = new HashMap<>();
        int count=1;
        for (int i = 0;i < arr.length; i++){
            if(x.containsKey(arr[i])){
                x.replace(arr[i],x.get(arr[i]),x.get(arr[i])+1);
            }
            else{
                x.put(arr[i], count);
            }
            if(x.get(arr[i]) > arr.length/2){
                maxele = arr[i];
            }
        }
        // System.out.println(x.toString());
        return maxele   ;
    }
}