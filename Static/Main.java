class hondaCity{
    static long price = 10;

    static double onRoadPrice(String city){
        switch(city){
            case "delhi":
            return price + price*0.1;
            break;
            case "mumbai":
            return price + price*0.09;
            break;
        }
    }

}
















class Main{
    public static void main(String[] args) {
        
    }
}