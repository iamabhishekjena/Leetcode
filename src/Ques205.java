import java.util.HashMap;

public class Ques205 {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))!=null){
                if(!map.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }
            map.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }

}
