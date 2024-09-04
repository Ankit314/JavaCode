class threadSynchronize {
    
    



    public synchronized void printTable(int n) {

        for (int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }


}

class thread1 extends Thread{

    threadSynchronize t;
    thread1(threadSynchronize t){
        this.t=t;

    }

    public void run(){



        t.printTable(5);


    }

}

class threa2 extends Thread{
    threadSynchronize t2;
    threa2(threadSynchronize t2){
        this.t2=t2;
    }
    public void run(){
        t2.printTable(7);
    }


}
class maine{
    public static void main(String[] args) {

        threadSynchronize obj=new threadSynchronize();

        thread1 t=new thread1(obj);
        threa2 t2=new threa2(obj);
        t.start();
        t2.start();


    }

}