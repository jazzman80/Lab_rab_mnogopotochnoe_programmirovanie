public class Main {
    public static void main(String[] args) {

        Thread[] threads = new Thread[3];

        for(int i = 0; i < 3; i++){
            threads[i] = new Thread(new Counter(), "Thread " + i);
            threads[i].start();
        }

        for(Thread thread: threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
