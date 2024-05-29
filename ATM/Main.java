

class ATM{
    
    synchronized public void checkBalance(String name){
        System.out.println("Balance for Account holder "+name+" is 10000");
    }

    synchronized public void withDraw(String name,int amount){
        System.out.println("Withdrawing amount "+amount+" from "+name+" account");
    }
}

class Customer1 extends Thread{
    ATM atm ;
    public Customer1(ATM atm){
        this.atm = atm;
    }
    @Override
    public void run(){
        atm.checkBalance("Rajvardhan Pawar");
        atm.withDraw("Rajvardhan Pawar", 500);
    }
}

class Customer2 extends Thread{
    ATM atm;
    public Customer2(ATM atm){
        this.atm = atm;
    }

    @Override
    public void run(){
        atm.checkBalance("Aman Pailwan");
        atm.withDraw("Aman Pailwan", 1000);
    }
}




public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer1 c1 = new Customer1(atm);
        Customer2 c2 = new Customer2(atm);
        c1.start();
        c2.start();
    }
}
