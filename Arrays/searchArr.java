import java.util.Scanner;
public class searchArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int n = sc.nextInt();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0 ; i < arr.length ; i++)
        {
            int temp = arr[i];
            if(n == temp){
                System.out.println("Element Found");
            }
        }    

    }
}