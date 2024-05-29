import java.util.*;

public class countNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0 ;
        int r;
        while(n > 0){
            r = n % 10;
            n = n / 10;
            sum++;
        }
        System.out.println(sum);
    }
}
