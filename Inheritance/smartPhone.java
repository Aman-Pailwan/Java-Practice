class CellPhone{
    private int phoneNumber;

    private int imei;

    private String contact;
    public void call(String n){
        System.out.println("Calling "+n);
    }

    public void sms(String msg){
        System.out.println("Message Sent "+msg);
    }

    public void addContact(String con){
        contact = con;
    }

    public void deleteContact(){
        contact = null;
    }

    public CellPhone(){
        imei = 0000000000000;
    }
    public String getContact(){
        return contact;
    }
}

class SmartPhone extends CellPhone{
    public void click(){
        System.out.println("Picture Clicked");
    }

    public void play(){
        System.out.println("Playing Spotify");
    }

}










class Main{
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        sp.addContact("AmanPailwan");
        System.out.println(sp.getContact());
        sp.play();
        sp.click();
        sp.call(sp.getContact());
    }
}