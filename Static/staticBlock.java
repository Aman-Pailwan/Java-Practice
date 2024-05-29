

class blocks{
    static{
        System.out.println("Block 1");
    }
    static{
        System.out.println("Block 2");
    }
}
















public class staticBlock {
    public static void main(String[] args) {
        blocks bl = new blocks();
        System.out.println("main");
    }    
}
