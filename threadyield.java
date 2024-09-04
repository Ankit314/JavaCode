class threadyield extends Thread {

    public void run(){

        String n=Thread.currentThread().getName();

        for (int i=1;i<=3;i++){
            System.out.println(n);
            Thread.yield();
        }
    }

}
class thread2 extends Thread{

    public void run(){
        String n=Thread.currentThread().getName();

        for (int i=1;i<=3;i++){
            System.out.println(n);
        }
    }

}
class F{
    public static void main(String[] args) {
        threadyield t=new threadyield();
        thread2 t2=new thread2();
        t.start();
        t2.start();
    }
}