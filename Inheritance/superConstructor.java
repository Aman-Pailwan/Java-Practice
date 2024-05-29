// Here we have used the super keyword to call the parametrised constructor from parent class
// as the param class from parent doesnt gets called if the child class param class object is created 

class Rectangle{
    int length;
    int breadth;

    public Rectangle(){
        length = breadth =1;
    }

    public Rectangle(int l , int b){
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle{
    int height;

    public Cuboid(){
        height = 1;
    }

    public Cuboid(int h ){
        height = h;
    }
    public Cuboid(int l , int b , int h){
        super(l,b);
        height = h;
    }

    public int volume(){
        return length*breadth*height;
    }
}
class Main{
    public static void main(String[] args) {
        Cuboid cube = new Cuboid(5,3,10);
        System.out.println(cube.volume());
    }
}