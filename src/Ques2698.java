public class Ques2698 {
    public static int punishmentNumber(int n) {

        int punishmentNum = 0;

        for(int curr = 1;curr <= n ;curr++){


            int square = curr*curr;

            if(canPartition(square,curr))
                punishmentNum += square;
        }

        return punishmentNum;

    }
    public static boolean canPartition(int num, int target){

        if(num < target || target < 0)
            return false;

        if(num == target)
            return true;

        return (canPartition(num/10,target-(num%10)) || canPartition(num/100,target-(num%100)) || canPartition(num/1000,target-(num%1000)));
    }

    public static void main(String args[]){
        int res = punishmentNumber(2000);
        System.out.println(res);
    }
}
