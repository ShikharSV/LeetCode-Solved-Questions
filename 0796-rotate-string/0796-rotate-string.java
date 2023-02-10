class Solution {
    public String rotate(String str){
        String sub1=str.substring(0,1);
        String sub2=str.substring(1);
        return sub2+sub1;
    }
    public boolean rotateString(String s, String goal) {
        for(int i=1;i<=s.length();i++){
            if(s.equals(goal)){
                return true;
            }
            else{
                s=rotate(s);
            }
        }
        return false;
    }
}