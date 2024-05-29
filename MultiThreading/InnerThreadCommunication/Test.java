class MyData{
    int value = 0;
    boolean flag = true;
    synchronized public void set(int v){
        while(flag!=true)
        try{wait();}catch(Exception e){}
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get(){
        int x;
        while(flag!=false)
        try{wait();}catch(Exception e){}
        x = value;
        flag = true;
        notify();
        return x;
    }
}


class Producer extends Thread{
    MyData d;
    public Producer(MyData d){
        this.d = d;
    }

    @Override
    public void run(){
        int count = 0;
        while(true){
            d.set(count);
            System.out.println("Producers "+ count);
            count++;
        }
    }
}


class Consumer extends Thread{
    MyData d ;
    public Consumer(MyData d){
        this.d = d;
    }

    @Override
    public void run(){
        int value;
        while(true){
            value = d.get();
            System.out.println("Consumer "+value);
        }
    }
}




class Test{
    public static void main(String[] args) {
        MyData d = new MyData();
        Consumer c = new Consumer(d);
        Producer p = new Producer(d);
        p.start();
        c.start();
    }
}