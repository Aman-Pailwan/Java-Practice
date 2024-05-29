@FunctionalInterface
interface myLambda{
    public void display();
}


// class My implements myLambda{
//     @Override
//     public void display(){
//         System.out.println("Hello");
//     }
// }









class Main{
    public static void main(String[] args) {
        // myLambda m = new myLambda() {
        //     public void display(){
        //         System.out.println("Hello");
        //     }
        // };

        /* Now we make this above anonymous class as lambda expressions */
        
        myLambda m = ()->{System.out.println("Hello");};

        m.display();
        
    }
}