public class InstanceMethods {
    public static void main(String[] args) {
        InstanceMethods obj=new InstanceMethods();

        System.out.println("instance Method use to add a number "+obj.add(10,12));

    }
    int s;
    public int add(int a,int b){
        s=a+b;
        return s;
    }
}
