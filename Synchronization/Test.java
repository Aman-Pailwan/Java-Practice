class myData{
     public void display(String str)
    {
        synchronized(this){
        for(int i = 0 ; i < str.length(); i++)
        {
            System.out.print(str.charAt(i));
        }
    }
    }
}

class myThread1 extends Thread
{
    myData d;
    public myThread1(myData d){
        this.d = d;
    }
    @Override
    public void run(){
        d.display("Hello World");
    }
}

class myThread2 extends Thread
{
    myData d;
    public myThread2(myData d){
        this.d = d;
    }
    @Override
    public void run(){
        d.display("Welcome");
    }
}

public class Test {
    public static void main(String[] args) {
        myData d = new myData();
        myThread1 t1 = new myThread1(d);
        myThread2 t2 = new myThread2(d);
        t1.start();
        t2.start();        
    }
}
