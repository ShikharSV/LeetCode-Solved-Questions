class Solution {
    public boolean rotateString(String s, String goal) {
        String str=goal+goal;
        if(s.length()!=goal.length()){
            return false;
        }
        else{
            return (str.contains(s));
        }
    }
}