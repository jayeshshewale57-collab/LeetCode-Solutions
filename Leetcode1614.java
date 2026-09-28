class Solution {
    public int maxDepth(String s) {
        
        int top=0;
        int max=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                if(s.charAt(i)=='('){
                    top++;
                }
                if(s.charAt(i)==')'){
                    top--;
                }
                if(max<top){
                    max=top;
                }
            }
            else{
                i++;
                continue;
            }
            i++;
        }
        return max;
    }
}