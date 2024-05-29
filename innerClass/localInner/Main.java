package localInner;
class Outer{

    public void meth1(){
        class inner{
            public void show(){
                System.out.println("HEllo");
            }
        }
        inner i = new inner();
        i.show();
    }
}


public class Main {
    public static void main(String[] args) {
        Outer oi = new Outer();
        oi.meth1();
    }
}
