class Ques1281 {

    public int diff(int num){
        int product=1;
        int sum=0;
        while(num>0){
            product = product*(num%10);
            sum = sum+(num%10);
            num=num/10;
        }
        return product-sum;
    }

    public int subtractProductAndSum(int n) {
        return diff(n);
    }
}