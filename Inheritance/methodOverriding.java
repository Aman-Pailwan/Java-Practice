class TV{
    public void switchOn(){System.out.println("Tv is turned on ");}
    public void changeChannel(){System.out.println("Changing Channel");}
}

class smarTv extends TV{
    @Override
    public void switchOn(){System.out.println("SmartTv is turned on ");}
    @Override
    public void changeChannel(){System.out.println("Changing smartTv Channel");}

    public void browse(){System.out.println("Browser Mode turned On");}

}







public class methodOverriding {
    public static void main(String[] args) {
        // TV t = new TV();
        // t.changeChannel();
        // t.switchOn();

        // smarTv t = new smarTv();
        // t.changeChannel();
        // t.switchOn();
        // t.browse();

        TV t = new smarTv();
        // here no additional methods can be called other then the methods declared in the parent class
        

    }
}
