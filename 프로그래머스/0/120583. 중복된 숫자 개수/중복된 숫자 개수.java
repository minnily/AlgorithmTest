class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i : array){
            if(i == n){
                answer += 1;
                
            }
            
        }
        return answer;
    }
}

// 스트림으로 작성하는 방식
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}
