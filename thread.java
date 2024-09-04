public class thread extends Thread
{
    public void run()
    {

            try
            {
                for (int i=1;i<=5;i++)
                {
                    System.out.println("ankit");
                    Thread.sleep(1000);
                }
            }


            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

    }
}
class B{
    public static void main(String[] args) throws InterruptedException {
        thread th=new thread();
        th.start();
        for (int i=1;i<=5;i++){
            System.out.println("jfgwhbgkj");
            Thread.sleep(1000);
        }
    }
}
