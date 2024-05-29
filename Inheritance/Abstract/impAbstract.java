abstract class Shape{
    abstract void perimeter();
    abstract void area();
}

class Circle extends Shape{
    
    public int radius;
    @Override
    public void perimeter(){
        System.out.println(2*Math.PI*radius);
    }

    @Override
    public void area(){
        System.out.println(Math.PI*radius*radius);
    }

}


class Rectangle extends Shape{
    public int length;
    public int breadth;

    @Override
    public void perimeter(){
        System.out.println(2*(length+breadth));
    }

    @Override
    public void area(){
        System.out.println(length*breadth);
    }
}

class impAbstract{
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.radius = 6;
        cir.area();
        cir.perimeter();

        Rectangle rec = new Rectangle();
        rec.length = 5;
        rec.breadth = 5;
        rec.area();
        rec.perimeter();
        System.out.println("Creating objects with reference as abstract class and object as child class");
        Shape s = new Circle();
        s.area();
        s.perimeter();



        Shape ss = new Rectangle();
        ss.area();
        ss.perimeter();
    }

}