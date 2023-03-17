package TestNGProrityDemo;

import org.testng.annotations.Test;

public class PriorityDemo {
    @Test (priority = 2)
    public void test1(){
        System.out.println("Inside TEST1");
    }
    @Test (priority = 1)
    public void test2(){
        System.out.println("Inside TEST2");
    }

    @Test
    public void test3(){
        System.out.println("Inside TEST3");
    }
}
