class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag == true){
            answer = a + b;
        }else{
          answer=a-b;  
        }
        
        return answer;
    }
}

// 삼항 연산자를 사용하여 푸는 방법
class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
