import java.util.Stack;

public class Ques739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        ans[n-1]=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i=1;i<n;i++){
            while(stack.empty()==false && temperatures[stack.peek()]<temperatures[i]){
                ans[stack.peek()]= i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
}
