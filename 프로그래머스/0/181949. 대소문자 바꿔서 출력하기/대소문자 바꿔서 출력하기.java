import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        //문자열이기에 length뒤에 () 붙여주기
        if(a.length()>=1&&a.length()<=20){
            //StringBuilder 사용해 각 문자 변환 후 추가(문자열 수정)
            StringBuilder result = new StringBuilder();
           for(int i=0;i<a.length();i++){
               char str = a.charAt(i);
           
            if(Character.isUpperCase(str)){
                result.append(Character.toLowerCase(str));
            }else{
                 result.append(Character.toUpperCase(str));
            }
        }
           System.out.println(result.toString()); 
        }
        sc.close();
    }
}