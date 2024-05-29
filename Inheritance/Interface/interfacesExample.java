interface Test{
    void meth1();
    void meth2();
}

class Test1 implements Test{
    @Override
    public void meth1() {
        System.out.println("Meth 1 from sub class");
    }
    @Override
    public void meth2(){
        System.out.println("Meth 2 from sub class");
    }

    public void meth3(){
        System.out.println("Meth 3 from sub class");
    }
}



class interfacesExample{
    public static void main(String[] args) {
        Test t;
        t = new Test1();
        t.meth1();
        t.meth2();

        Test1 st =  new Test1();
        st.meth1();
        st.meth2();
        st.meth3();
    }
}