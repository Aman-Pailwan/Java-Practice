@FunctionalInterface
interface myLambda{
    public void display();
}

class useLambda{
    myLambda ml;

    public void callLambda(myLambda ml){
        ml.display();
    }
} 











class Demo{

    public void method1(){
        useLambda ul = new useLambda();
        ul.callLambda(()->{System.out.println("Hello");});
    }
    public static void main(String[] args) {
        Demo d =new Demo();
        d.method1();
    }
}