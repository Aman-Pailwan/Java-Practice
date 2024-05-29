// First Method
// class MyThread extends Thread{

//     @Override
//     public void run() {
//         int i = 1;
//         while(true){
//             System.out.println(i +" Hello");
//             i++;
//         }
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         MyThread mT = new MyThread();
//         mT.start();
//         int r = 1;
//         while(true){
//             System.out.println(r+" World");
//             r++;
//         }


//     }
// }

// Second Method

class Main extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(i < 11){
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        Main t = new Main();
        t.start();
        int r =1;
        while(r < 11){
            System.out.println(r+" World");
            r++;
        }
    }
}