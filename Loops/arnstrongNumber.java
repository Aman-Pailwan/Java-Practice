import java.util.Scanner;

public class arnstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n = sc.nextInt();
        int r;
        int sim = 0;
        int m = n;
        while(n > 0){
            
            r = n % 10;
            n = n / 10;
            sim += r * r * r ;
        }
        if( m == sim){
                System.out.println("The Number is Armstrong");
            }else{
                System.out.println("The number is not and armstrong number");
            }
        
    }
}
