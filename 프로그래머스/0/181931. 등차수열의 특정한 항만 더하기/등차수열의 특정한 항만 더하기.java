class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i=0;i<included.length;i++){
            if(included[i]){
             answer+= a + i*d;   
            }
            
        }
        return answer;
    }
}

//스트림으로 풀기
import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(idx -> included[idx]?a+(idx*d):0).sum();
    }
}
