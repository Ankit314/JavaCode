class threadShedular extends Thread {
    public void run(){

        String s=Thread.currentThread().getName();
        for (int i=1;i<=3;i++){
            System.out.println(s);
        }

    }
}
class D{
    public static void main(String[] args) {
        threadShedular t1=new threadShedular();
        threadShedular t2=new threadShedular();
        threadShedular t3=new threadShedular();
        t1.setName("thread 1");
        t2.setName("Thread 2");
        t3.setName("thread 3");
        t1.start();
        t2.start();
        t3.start();

    }
}
