import java.util.ArrayList;
import java.util.List;

class Ques728 {
    public boolean selfDividing(int num){
        int on = num;
        int rem;
        while(num>0){
            rem= num%10;
            if(rem==0){
                return false;
            }
            if(on%rem!=0){
                return false;
            }
            num = num/10;
        }
        return true;

    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> sol = new ArrayList<>();
        for(int i = left;i<=right;i++){
            if(selfDividing(i)){
                sol.add(i);
            }
        }
        return sol;
    }
}