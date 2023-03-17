public class ExceptionThrowsDemo {
       public static void main(String[] args) {

           try {
               DemoThrows();
           }
           catch(Exception exp)
           {
               exp.printStackTrace();
           }
           finally {
               System.out.println("This is going to the final section which will be executed even when there is exception or not");
           }
       }
       public static void DemoThrows() throws Exception{
           System.out.println("Hello to exception");
           int i = 1 / 0;
           System.out.println("Completed");
       }
}
