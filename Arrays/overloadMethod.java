public class overloadMethod {
    
    // static double area(int r){
    //     return Math.PI*r*r;
    // }
    // static double area(int l , int b){
    //     return l * b;
    // }

    static int reverse(int n){
        int r ;
        int rev = 0;
        while(n>0){
            r = n % 10;
            n = n / 10;
            rev = rev * 10 + r;
        }
        return rev;
    }

  static  int[] reverse(int arr[]){
        int b[] = new int[arr.length];

        for(int i = arr.length - 1, j= 0 ; i>=0;i--,j++){
            b[j] = arr[i];
        }
        return b;
        
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println(reverse(a));
    }
}
