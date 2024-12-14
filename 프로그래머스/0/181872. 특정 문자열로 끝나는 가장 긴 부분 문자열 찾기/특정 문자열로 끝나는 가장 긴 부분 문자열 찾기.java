class Solution {
    public String solution(String myString, String pat) {
        int index = 0;
        index = myString.lastIndexOf(pat);
        return myString.substring(0,index + pat.length());
    }
}