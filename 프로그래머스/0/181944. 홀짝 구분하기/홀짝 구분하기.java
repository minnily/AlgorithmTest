import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n>=1 && n<=1000){
            
            if(n % 2 == 0){
                System.out.printf("%d is even",n);
            }else{
            System.out.printf("%d is odd",n);
                }
            
         }
    }
}

//삼항 연산자를 사용한 간편한 방법
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));


    }
}
