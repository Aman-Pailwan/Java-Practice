// class my implements Runnable{
//     @Override
//     public void run(){
//         int i = 1;
//         while(true){
//             System.out.println(i+ " Hello");
//             i++;
//         }
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         my m = new my();
//         Thread t = new Thread(m);
//         t.start();

//         int r =1;
//         while(true){
//             System.out.println(r+" World");
//             r++;
//         }
//     }
// }

class Test implements Runnable{
    @Override
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+ " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        Test m = new Test();
        Thread t = new Thread(m);
        t.start();
        int r =1;
        while(true){
            System.out.println(r+ " World");
            r++;
        }
    }

}