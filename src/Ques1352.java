import java.util.ArrayList;
import java.util.List;

public class Ques1352 {
    List<Integer> numberList;
    int prod;
    public void ProductOfNumbers() {
        numberList = new ArrayList<>();
        prod =1;
    }

    public void add(int num) {
        if(num==0){
            numberList = new ArrayList<>();
            prod=1;
            return;
        }
        else{
            prod *= num;
            numberList.add(prod);
        }

    }

    public int getProduct(int k) {
        int ans = numberList.get(numberList.size()-1);
        if(k>numberList.size()){
            return 0;
        }
        if(k==numberList.size()){
            return ans;
        }
        return ans/(numberList.get(numberList.size()-1-k));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

