import java.util.HashMap;

public class Ques290 {
    public boolean wordPattern(String pattern, String s) {
        String[] array = s.split(" ");
        if(pattern.length()!=array.length){
            return false;
        }

        HashMap<Character,String> map = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(!map.containsValue(array[i])){
                    map.put(pattern.charAt(i),array[i]);
                }
                else{
                    return false;
                }
            }
            else{
                if(!map.get(pattern.charAt(i)).equals(array[i])){
                    System.out.println(pattern.charAt(i));
                    System.out.println(array[i]);
                    return false;
                }
            }
        }
        return true;
    }
}
