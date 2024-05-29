@FunctionalInterface
interface myLambda{
    public void display(String str);
}














class Main{
    public static void main(String []args){

        myLambda ml = System.out::println;
        ml.display("HELLLO");


    }
}