//import가 안되면.. 실행시 적용이 안된다는 것 잊지말기
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
       
         Arrays.sort(array);
        
        //배열 중앙 인덱스 찾기
        int answer = array.length/2;
        
        return array[answer];
    }
}
