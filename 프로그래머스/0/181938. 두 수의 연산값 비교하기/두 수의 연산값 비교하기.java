class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab= "" + a + b;
        
        answer = Integer.parseInt(ab);
        
        return Math.max(answer,2*a*b);
    }
}