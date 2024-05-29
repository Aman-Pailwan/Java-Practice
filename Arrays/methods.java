public class methods{

    // static boolean isPrime(int x){
    //     int y = x / 2;
    //     for(int i = 2 ; i < y ; i++){
    //         if(x %i == 0){ 
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    
    // static int gcd(int m , int n){
    //     while(m != n){
    //         if(m > n){
    //             m = m - n;
    //         }else if(n > m){
    //             n = n -m;

    //         }
            
    //     }
    //     return m;
    // }
    
    static int maxElement(int arr[]){
        int max = arr[0];
        for(int i = 1 ; i < arr.length-1 ; i++)
        {
            if(arr[i+1] > arr[0]){
                max = arr[i+1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int x[] = {1,2,3,4,5,6,7,55,91,500};
        System.out.println(maxElement(x));
    }
}