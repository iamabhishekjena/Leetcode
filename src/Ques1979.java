public class Ques1979 {
        public int findGCD(int[] nums) {
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            for(int i =0;i<nums.length;i++){
                if(nums[i]>max){
                    max= nums[i];
                }
                if(nums[i]<min){
                    min = nums[i];
                }
            }
            for(int i = Math.min(min,max);i>0;i--){
                if(min%i ==0 && max%i ==0){
                    return i;
                }
            }
            return 1;
        }
    }
