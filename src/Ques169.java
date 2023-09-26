import java.util.HashMap;
import java.util.Map;

public class Ques169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> result : map.entrySet()){
            if (result.getValue()>(nums.length/2)){
                return result.getKey();
            }
        }
        return 0;
    }
}
