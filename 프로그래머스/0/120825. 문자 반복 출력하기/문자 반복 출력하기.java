class Solution {
    public String solution(String my_string, int n) {
         StringBuilder answer = new StringBuilder();
        //문자열을 문자 배열로 변환하는 것 
        for(char c: my_string.toCharArray()){
            //각문자 c를 반복하기 위해 중첩 for문 사용
            for(int j=0;j<n;j++){
                 answer.append(c);
            }
        }
         return answer.toString();
    }
}