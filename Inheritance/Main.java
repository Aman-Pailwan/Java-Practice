class Account{
    public String accountNumber ;

    public String accountName;

    public String address;

    public String dateOfBirth;

    public String contact;
    public double balance;

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountName(String n){
        accountName = n;
    }

    public void setAddress(String add){
        address = add;
    }

    public void setDateOfBirth(String DOB){
        dateOfBirth = DOB;
    }

    public Account(String acc,String accName,String addr, String contact , String dateOfBirth){
        accountNumber = acc;
        accountName = accName;
        address = addr;
        this.contact = contact;
        this.dateOfBirth = dateOfBirth;
        balance =0;
    }
    public Account(){

    }

}

class SavingAccount extends Account{
    public void deposit(double dep){
        balance = balance +dep;
    }

    public void withdraw(double wid){
        balance = balance - wid;
    }
}

class LoanAccount extends Account{
    public void payEmi(double emi){
        balance =balance - emi;
    }
}

class Main{
    public static void main(String[] args) {
        Account acc = new Account("A12","Aman-Pailwam","Nagala Park","9766123075","25-09-2001");

        SavingAccount save = new SavingAccount();
        save.deposit(100);
        save.withdraw(50);

        System.out.println(save.getBalance());



    }
}