import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        //오름차순으로 정렬
        Arrays.sort(numbers);
        
        //배열 길이 변수지정
        int n = numbers.length;
        
        //가장 높은 값과 그 밑 값 곱
        answer = numbers[n-1]*numbers[n-2];
        
        return answer;
    }
}

//스트림 
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}
