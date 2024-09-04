class Thread_sleep extends Thread{

    public void run(){
        String n=Thread.currentThread().getName();
        for (int i=1;i<=3;i++){
            System.out.println(n);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class E{
    public static void main(String[] args) {
        Thread_sleep t=new Thread_sleep();
        Thread_sleep t2=new Thread_sleep();
        Thread_sleep t3=new Thread_sleep();

        t.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t.start();
        t2.start();
        
        t3.start();

    }
}
