 class Variable {
    static int a=20; //static
     int b=30; //instance

     public static void main(String[] args) {
         int c=90;//local variable
         Variable ref= new Variable();
         System.out.println(c);
         System.out.println(Variable.a);
         System.out.println(ref.b);

     }
}
