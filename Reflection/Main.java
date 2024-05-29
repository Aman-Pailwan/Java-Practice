import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class My{
    private int a ;
    public int b;
    protected int c;
    int d;

    public My(){}

    public My(String str1 , String str2){}

    public void getDisplay(){}

}

















class Main{
    public static void main(String[] args) {
        Class c;
        c = My.class;

        Field field[] = c.getDeclaredFields();

        for(Field f :field){
            System.out.println(f);
        }

        Method meth[] = c.getMethods();
        for(Method m : meth)System.out.println(m);
    }
}