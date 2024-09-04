class threadisAlive extends Thread{

    public void run(){
        System.out.println("Thread isAlive");

    }


}
class G{
    public static void main(String[] args) {
        threadisAlive t=new threadisAlive();
        threadisAlive t2=new threadisAlive();
        System.out.println(t.isAlive());
        t.start();
        t2.start();
        System.out.println(t2.isAlive());
    }
}
