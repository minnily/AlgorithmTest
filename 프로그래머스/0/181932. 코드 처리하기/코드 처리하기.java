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

// 다른 방법 
class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            //홀수 짝수인 경우를 mode로 표현할 수 있다니..!
            if (i % 2 == mode) {
                answer.append(current);
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
