package companies.sigmoid;

public class Question6 {

    public static  class ThreadExample implements Runnable {
        public void run(){
            for (int i = 1; i<=3; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();
        ThreadExample t3 = new ThreadExample();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);
//        try {
//            thread1.start();
//            thread1.join();
//            thread2.start();
//            thread2.join();
//            thread3.start();
//            thread3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //Output for above:
//        1 2 3
//        1 2 3
//        1 2 3

        thread1.start();
        thread2.start();
        thread3.start();
    }
}



