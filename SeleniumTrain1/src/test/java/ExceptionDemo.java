public class ExceptionDemo {
    //Test
       public static void main(String[] args) {

           try {
               System.out.println("Hello to exception");
               int i = 1 / 0;
               System.out.println("Completed");
           }
           catch(Exception exp)
           {
               System.out.println("inside the catch block");
               System.out.println("exception caught is"+exp.getMessage());
               System.out.println("exception caught is"+exp.getCause());
               exp.printStackTrace();
           }
           finally {
               System.out.println("This is going to the final section which will be executed even when there is exception or not");
           }
       }
}
