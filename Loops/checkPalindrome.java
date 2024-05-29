import java.util.Scanner;
public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number to reverse: ");
        int n = sc.nextInt();
        int m = n;
        int r ;
        int reverse = 0;

        while(n > 0){
            r = n % 10;
            n = n / 10;
            reverse = reverse * 10 + r;
        }
        if( reverse == m){
            System.out.println("The Number is palindrome");
        }else{
            System.out.println("The Number is not palindrome");
        }
    }
}
