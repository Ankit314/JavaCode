 class runnable_interface implements Runnable {

    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println("start thread");
        }

    }
 }
 class b {
     public static void main(String[] args) {
         runnable_interface r=new runnable_interface();
         Thread t=new Thread(r);
         t.start();
         for (int i=1;i<=10;i++){
             System.out.println("main thread ");
         }


     }
 }
