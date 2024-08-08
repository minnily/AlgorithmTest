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

//스트림
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}

//List+ 스트림
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}

// 다른 방식
class Solution {
    public int[] solution(int n) {
        int[] answer = {};

        if (n % 2 == 1) answer = new int[n/2 + 1];
        else answer = new int[n/2];

        int cnt = 0;
        for (int i = 1; i <= n; i ++) {
            if (i % 2 == 1) { answer[cnt] = i; cnt++; }
        }

        return answer;
    }
}
