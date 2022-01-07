class Solution {
    public boolean backspaceCompare(String s, String t) {
        String sa=Backspace(s);
        String ta=Backspace(t);
        
        return sa.equals(ta);
    }
    private String Backspace(String s){
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                count++;
            }
            else if(count!=0){
                count--;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}