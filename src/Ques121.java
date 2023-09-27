public class Ques121 {
    public int maxProfit(int[] prices) {
        int lsf =prices[0];  //least value so far
        int op =0; //optimal profit
        int pst; //profit if sold today

        for(int i=1;i<prices.length;i++){
            if(prices[i]<lsf){
                lsf=prices[i];
            }
            pst = prices[i]-lsf;

            if(op<pst){
                op = pst;
            }
        }


        return op;
    }
}
