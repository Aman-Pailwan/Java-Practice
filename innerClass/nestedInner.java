class Outer{
    int x = 10;
    class inner{
        int y = 20;
        public void innerDisplay(){
            System.out.println(x + "" + y);
        }
    }

    public void outerDisplay(){
        inner in = new inner();
        System.out.println(in.y);
    }
}


class nestedInner{
    public static void main(String[] args) {
        Outer.inner oi = new Outer().new inner();
        oi.innerDisplay();
    }
}