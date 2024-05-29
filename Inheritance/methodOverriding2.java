class Car{
    public void accelerate(){System.out.println("Car is accelerating");}
    public void changeGear(){System.out.println("The Gear is Changing ");}
}

class luxuryCar extends Car{
     public void accelerate(){System.out.println("Car is accelerating");}
     @Override
     public void changeGear(){System.out.println("Gears are automatically changed  ");}
     public void openRoof(){System.out.println("Opening The Moon Roof");}
}


public class methodOverriding2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.accelerate();
        c.changeGear();

        luxuryCar lc = new luxuryCar();
        lc.accelerate();
        lc.changeGear();
        lc.openRoof();

        Car rl = new luxuryCar();
        rl.accelerate();
        rl.changeGear();
    }
}
