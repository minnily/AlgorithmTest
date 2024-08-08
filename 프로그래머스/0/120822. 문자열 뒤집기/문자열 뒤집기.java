class Solution {
    public String solution(String my_string) {
        //StringBuilder는 문자열을 수정할 수 있는 편리한 클래스임
        StringBuilder answer = new StringBuilder(my_string);
        //해당 문자열 뒤집기
        answer.reverse();
        
        //해당 배열 문자로 나타나게 바꿔주기
        return answer.toString();
    }
}