enum dept{
    CS("Aman" , "Block C") , IT("Rajvardhan" , "Block D") , ECE("Rehan" , "BLock M") , CIVIL("Satyadeep" , "Block A");

    String head;
    String block;
    private dept(String head , String block){
        this.head = head;
        this.block = block;
    }

    public String getHead(){
        return head;
    }

    public String getBlock(){
        return block;
    }
}












class Main{
    public static void main(String[] args) {
        dept d = dept.IT;
        System.out.println(d.getHead());
        System.out.println(d.getBlock());

    }
}
