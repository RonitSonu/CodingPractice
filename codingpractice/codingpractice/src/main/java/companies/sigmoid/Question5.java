package companies.sigmoid;

public class Question5 {

    public static class ThreadTest extends Thread {
        private int x = 0;
        public void run() {
            synchronized(this) {
                for(int i=0; i<5; i++){
                    x++;
                }
                notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{

        ThreadTest t = new ThreadTest();
        synchronized (t){
            t.start();
            t.wait();
            System.out.println(t.x);
        }
    }
}

//Output: 5