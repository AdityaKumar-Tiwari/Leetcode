class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;  
         //take string as :- s = k i d p |i|
         //                  t = a o a r |x| edge case ; Is=  Isomorphic strings 
        HashMap<Character, Character> Is = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            char orignal =  s.charAt(i);
            char replace =  t.charAt(i);
            if(!Is.containsKey(orignal)){
                if(!Is.containsValue(replace))
                Is.put(orignal,replace);
                else{
                    return false;
                }
            }
            else{
                    char mappedcharacter = Is.get(orignal);    //cheak value from char// i->x
                    if(mappedcharacter != replace) return false;
                }
        }
         return true;
    }
}