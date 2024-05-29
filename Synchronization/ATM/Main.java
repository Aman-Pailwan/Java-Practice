package ATM;

class ATM{
    public void checkBalance(String name){
        System.out.println("Balance for Account holder "+name+" is 10000");
    }

    public void withDraw(String name,int amount){
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






public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer1 c1 = new Customer1(atm);
        c1.start();
    }
}
