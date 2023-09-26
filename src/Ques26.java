import java.util.ArrayList;

public class Ques26 {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }

        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }
}
