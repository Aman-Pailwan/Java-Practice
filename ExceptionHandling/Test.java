// Handling exception i.e Dividing by zero




class Test{
    public static void main(String[] args) {
        
        int a , b , c;
        try{
        a = 5;
        b = 0;
        c = a / b;

        System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.err.println("Cannot Divide a number by zero "+e);
        }

        System.out.println("Executed Successfully");
    }
}