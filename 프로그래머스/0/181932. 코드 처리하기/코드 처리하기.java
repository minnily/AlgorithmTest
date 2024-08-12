class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        
        
        for(int idx = 0; idx<code.length();idx++){
          if(code.charAt(idx)=='1') {
              mode= (mode==0) ? 1:0;
             }else{
              
               if((mode == 0  && idx%2 ==0)|| (mode == 1 && idx %2 == 1)){
                        answer.append(code.charAt(idx)); 
                }
             } 
        }
             return answer.length() == 0? "EMPTY":answer.toString();
   }
}