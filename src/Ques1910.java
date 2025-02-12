import java.util.Stack;

public class Ques1910 {
    public static String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
            if(stack.size()>=part.length() && checkMatch(stack,part,part.length())){
                for(int j=0;j<part.length();j++){
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.peek());
            stack.pop();
        }

        return sb.reverse().toString();
    }

    private static boolean checkMatch(Stack<Character> stack, String part, int partLength){
        Stack<Character> temp = new Stack<>();
        temp.addAll(stack);

        for(int index = partLength-1; index>=0;index--){
            if(temp.isEmpty() || temp.peek()!= part.charAt(index)){
                return false;
            }
            temp.pop();
        }

        return true;
    }


    public static void main(String args[]){
        removeOccurrences("daabcbaabcbc","abc");
    }
}
