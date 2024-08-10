class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int a = 0;
        
        if(n%2 == 1){
            for(int i=1;i<=n;i+=2){
                answer += i;
            }
        }else{
            for(int i=2;i<=n;i +=2){
                answer += i*i;
            }
        }
        
        return answer;
    }
}


// 삼항연산자를 사용하는 방
class Solution {
    public int solution(int n) {
        int answer = 0;
        
            for(int i = n; i >= 0; i -= 2)
                answer += (n % 2 == 0) ? i * i : i;

        return answer;
    }
}
        
