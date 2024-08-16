class Solution {
    public int[] solution(long n) {
        // long 타입 숫자를 문자열로 변환
        String str = Long.toString(n);

        // 문자열의 길이만큼 배열 생성
        int[] answer = new int[str.length()];

        // 문자열을 뒤에서부터 읽어 배열에 숫자 저장
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
        }
        return answer;
    }
}


