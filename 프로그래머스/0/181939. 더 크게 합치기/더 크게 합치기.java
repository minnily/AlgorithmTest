class Solution {
    public int solution(int a, int b) {
        
        String ab=String.valueOf(a)+String.valueOf(b);
        String bc = String.valueOf(b)+String.valueOf(a);
        
        int abInt = Integer.parseInt(ab);
        int bcInt = Integer.parseInt(bc);
        
        return Math.max(abInt,bcInt);
    }
}

// 다른 방법
// class Solution {
//     public int solution(int a, int b) {
//         String answer = ""+a+b;
//         String answer2 = ""+b+c;
//         return answer.compareTo(answer2)>=1 ?Integer.parsInt(answer):Integer.parsInt(answer2);
//     }
// }