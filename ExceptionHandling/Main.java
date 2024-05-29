//custom exception handling
class negativeDimensionException extends Exception{
    @Override
    public String toString(){
        return "Dimensions cannot be negative";
    }
}




class meth{
    int area(int l , int b) throws negativeDimensionException
    {   if(l<0||b<0){
        throw new negativeDimensionException();
    }
        int a = l*b;
        return a;
    }
}


class Main{
    public static void main(String[] args) {
        meth m = new meth();
        try{
            System.out.println(m.area(-3, 3));
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}