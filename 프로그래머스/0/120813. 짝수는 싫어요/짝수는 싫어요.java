class Solution {
    public int[] solution(int n) {
        // n 이하의 홀수 개수를 계산
        int count = (n+1)/2;
        
        //배열 생성
        int[] answer = new int [count];
        
        // 배열에 홀 수 채우기
        for(int i=0;i<count;i++){
           answer[i] = 2*i+1;
        }
        
        return answer;
    }
}