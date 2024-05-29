class coffeeMachine{
    private int waterQty;
    private int coffeeQty;
    static  private coffeeMachine our = null;
    private coffeeMachine(){
        waterQty = 1;
        coffeeQty = 1;
    }

    static  coffeeMachine getInstance(){
        if(our== null)
            our = new coffeeMachine();
        return our;
    }
}


class Main{
    public static void main(String[] args) {
        coffeeMachine c = coffeeMachine.getInstance();

        System.out.println(c.getInstance());
    }
}