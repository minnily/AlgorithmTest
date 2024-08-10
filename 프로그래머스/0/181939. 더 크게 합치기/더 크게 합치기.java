class Solution {
    public int solution(int a, int b) {
        
        String ab=String.valueOf(a)+String.valueOf(b);
        String bc = String.valueOf(b)+String.valueOf(a);
        
        int abInt = Integer.parseInt(ab);
        int bcInt = Integer.parseInt(bc);
        
        return Math.max(abInt,bcInt);
    }
}

 다른 방법
 class Solution {
    public int solution(int a, int b) {
        String answer = ""+a+b;
        String answer2 = ""+b+c;
            answer = answer > answer2 ? answer : answer2;
         return answer;
     }
 }

// 더 간편한 방법
Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a))
class Solution {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }
}
