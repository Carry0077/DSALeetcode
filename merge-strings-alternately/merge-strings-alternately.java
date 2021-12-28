class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1=0;
        int p2=0;
        int n=word1.length();
        int m=word2.length();
        StringBuilder sb=new StringBuilder();
        while(p1<n || p2<m){
            if(p1<n){
                sb.append(word1.charAt(p1++));
               
            }
            if(p2<m){
                 sb.append(word2.charAt(p2++));
            }
        }
        return sb.toString();
    }
}          