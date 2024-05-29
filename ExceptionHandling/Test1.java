//Nested Try Catch 1st Type 

public class Test1 {
    public static void main(String[] args) {
        int A[] = {1,2,3,5,7};
        float r;
        try{
            r = A[0]/A[1];
            System.out.println(r);

            System.out.println(A[10]);
        }
        catch(ArithmeticException e){
            System.err.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
    }
}
