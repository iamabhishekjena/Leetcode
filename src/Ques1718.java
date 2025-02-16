public class Ques1718 {
    public static int[] constructDistancedSequence(int n) {
        int[] result = new int[2*n -1];
        boolean[] used = new boolean[n+1];
        backtrack(result,used,n,0);
        return result;
    }

    public static boolean backtrack(int[] result,boolean[] used,int n,int index){
        while(index<result.length && result[index]!=0){
            index++;
        }

        if(index == result.length){
            return true;
        }

        for(int i=n;i>=1;i--){
            if(used[i]) continue;

            if(i==1){
                result[index]=i;
                used[i]= true;
                if(backtrack(result,used,n,index+1)) return true;
                result[index] =0;
                used[i]=false;
            }
            else{
                if(index+i<result.length && result[index+i]==0){
                    result[index]=i;
                    result[index+i]=i;
                    used[i]=true;
                    if(backtrack(result,used,n,index+1)) return true;
                    result[index]=0;
                    result[index+i]=0;
                    used[i]=false;
                }
            }
        }

        return false;
    }

    public static void main(String args[]){
        constructDistancedSequence(3);
    }
}
