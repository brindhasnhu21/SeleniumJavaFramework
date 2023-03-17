package TestNGProrityDemo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamDemo {
    @Test
    @Parameters({"name"})
    public void printName(@Optional ("Dhanabalu") String name)
    {
        System.out.println("This is the name"+name);
    }
}
