class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =0;i<=str1.length();i++){
            for(int j=0; j<=str2.length();j++){
                if(str1.contains(str2)){
                    answer = 1;
                }else{
                    answer =2;
                }
            }
            
        }
        
        
        
        return answer;
    }
}