class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean Arr[]=new boolean[26];
        for(char c:sentence.toCharArray()){
            if(c>='a' && c<='z'){
                Arr[c-'a']=true;
            }
        }
        for(boolean pre:Arr){
            if(!pre){
                return false;
            }
        }
        return true;
    }
}