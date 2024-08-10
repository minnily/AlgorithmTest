class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i =0 ; i < k;i++){
            answer += my_string;
        }
        return answer;
    }
}

// 간편한 방법

class Solution {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}

//repeat()을 쓰면 반복할 수 있다
