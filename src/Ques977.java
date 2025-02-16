public class Ques977 {
    public static int[] sortedSquares(int[] nums) {
        int i=0;
        int j= nums.length-1;
        int k=j;
        int[] res = new int[nums.length];
        while(i<=j){
            if(Math.abs(nums[i])>=Math.abs(nums[j])){
                res[k]= nums[i]*nums[i];
                i++;
            }
            else{
                res[k] = nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return res;
    }

    public static void main(String args[]){
        int[] res = sortedSquares(new int[]{-4,-1,0,3,10});
    }
}
