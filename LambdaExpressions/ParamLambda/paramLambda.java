@FunctionalInterface
interface myLambda{
    public int add(int x, int y);
}


class paramLambda{
    public static void main(String[] args) {
        myLambda m = (a,b)->{return a+b;};
        int r = m.add(3, 4);
        System.out.println(r);
    }
}
