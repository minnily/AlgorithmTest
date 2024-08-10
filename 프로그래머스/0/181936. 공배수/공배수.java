class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        
        return number%n ==0 && number%m==0 ? 1: 0;
    }
}

// 2번째 방법
// class Solution {
//     public int solution(int number, int n, int m) {
// if(number % n == 0 && number %m == 0){
//             answer = 1;
//         }else{
//             answer = 0;
//         }
//         return answer;
//     }