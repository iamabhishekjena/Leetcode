public class Ques1079 {
    public int numTilePossibilities(String tiles) {
        int[] charCount = new int[26];
        for(char ch:tiles.toCharArray()){
            charCount[ch-'A']++;
        }
        return buildChar(charCount);
    }

    private int buildChar(int[] charCount){
        int totalCount=0;
        for(int i=0;i<26;i++){
            if(charCount[i]>0){
                totalCount++;
                charCount[i]--;
                totalCount += buildChar(charCount);
                charCount[i]++;
            }
        }
        return totalCount;
    }

    public static void main(String args[]){
        Ques1079 ques1079 = new Ques1079();
        ques1079.numTilePossibilities("AAB");
    }
}
