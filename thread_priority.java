 class thread_priority extends Thread {

    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

    }
}
class P{
    public static void main(String[] args) {

        thread_priority t1=new thread_priority();
        thread_priority t2=new thread_priority();
        thread_priority t3=new thread_priority();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(2);
        t2.setPriority(1);
        t3.setPriority(4);

        t1.start();
        t2.start();
        t3.start();

    }
}
