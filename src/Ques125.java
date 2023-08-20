class Ques125 {

    boolean isPalRec(String s,int start, int end){

        if(start>end)
            return true;

        if(s.charAt(start) != s.charAt(end)){
            return false;
        }

        return isPalRec(s,start+1,end-1);
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String newString ="";
        for(int i=0;i<s.length();i++){
            if(!Character.isLetterOrDigit(s.charAt(i)))
                continue;
            else
                newString+= s.charAt(i);
        }
        return isPalRec(newString,0,newString.length()-1);
    }
}