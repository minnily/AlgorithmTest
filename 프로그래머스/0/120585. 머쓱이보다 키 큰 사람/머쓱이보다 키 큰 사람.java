class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            if(height<array[i]){
                answer +=1;
            }
        }
        return answer;
    }
}

// 다른 방식
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i : array) {
            if(i > height) answer++;
        }
        return answer;
    }
}



//스트림 방식
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(value -> value > height).count();
    }
}
