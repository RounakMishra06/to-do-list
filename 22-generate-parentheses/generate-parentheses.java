class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>(); 
        back("", 0, 0, n, result);
         return result;
    }
    void back(String curr,  int open, int close, int n , List<String> result){
        if(curr.length() == 2 * n){
            result.add(curr);
            return;
    }
    if(open<n){
    back(curr+"(",open+1,close,n,result);
    }
    if(close<open){
        back(curr+")",open,close+1,n,result);
        }
    }
}