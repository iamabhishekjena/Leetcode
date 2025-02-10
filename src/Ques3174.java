import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Ques3174 {
    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<10;i++){
            set.add((char)(i+'0'));
        }
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
    public static void main(String args[]){
        clearDigits("cb34");
    }
}
