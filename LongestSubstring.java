import java.util.HashMap;

public class LongestSubstring {
    public static void main(String []args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubString(s));
    }   

    public static int lengthOfLongestSubString(String s){
        int count = 0;
        int len = 0;
        HashMap<Character, Integer> x = new HashMap<>();
        if(s.length()==1) return 1;
        for(int i = 0; i < s.length(); i++){
            if(x.containsKey(s.charAt(i))){
                if(count>len){
                    len = count;
                }
                x.clear();
                count=1;
                x.put(s.charAt(i),1);
            }
            else{
                x.put(s.charAt(i),1);
                count++;
            }
        }
        return len;
    } 
}
