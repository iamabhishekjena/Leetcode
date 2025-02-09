import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ques916 {
    public static List<String> wordSubsets(String[] words1, String[] words2) {

        HashMap<Character,Integer> orignal = new HashMap<>();

        for(int i=0;i<words2.length;i++){
            for(int j=0;j<words2[i].length();j++){
                orignal.put(words2[i].charAt(j),orignal.getOrDefault(words2[i].charAt(j),0)+1);
            }
        }

        List<String> res = new ArrayList<>();
        HashMap<Character,Integer> temp = new HashMap<>();
        for(int i=0;i<words1.length;i++){
            temp.putAll(orignal);

            for(int j=0;j<words1[i].length();j++){
                if(temp.containsKey(words1[i].charAt(j))){
                    temp.put(words1[i].charAt(j),temp.get(words1[i].charAt(j))-1);
                    if(temp.get(words1[i].charAt(j))==0){
                        temp.remove(words1[i].charAt(j));
                    }
                }
            }
            if(temp.size()==0){
                res.add(words1[i]);
            }
        }

        return res;
    }

    public static void main(String args[]){
        List<String> result = wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"},new String[]{"e","o"});

        result.forEach((String s) -> System.out.println(s));
    }



}
