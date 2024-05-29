// Nested Try-Catch
public class Test3 {
    public static void main(String[] args) {
        int A[] = {10,0,25,30,40};
        int r;
        try{
            r = A[0]/A[1];
            System.out.println(r);
            try
            {
                System.out.println(A[10]);
            }catch(ArrayIndexOutOfBoundsException e)
            {
                System.err.println("Targeted Index out of bound , The Lenght of array is "+A.length);    
            }
        }catch(ArithmeticException e)
        {
            System.err.println("Cannot Divide With zero "+e );
        }        
    }
}
