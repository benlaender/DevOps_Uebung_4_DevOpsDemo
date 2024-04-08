package ch.zhaw.iwi.devops.CallElevator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ch.zhaw.iwi.devops.demo.Elevator;


public class CallElevator_Test
{
    @Test
    public void Test1()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Door opens", Button.call(0, 0));
    }

    @Test
    public void Test2()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Up", Button.call(1, 2));
    }

    @Test
    public void Test3()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Down", Button.call(3, -1));
    }

    @Test
    public void Test4()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Down", Button.call(500, -1));
    }

    @Test
    public void Test5()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Down", Button.call(-100, -1));
    }

    @Test
    public void Test6()
    {
        Elevator Button = new Elevator();
        Assertions.assertNotEquals("Down", Button.call(300,1));
    }

    @Test
    public void Test7()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Down", Button.call(-2, 500));
    }
}
