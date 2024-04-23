package ch.zhaw.iwi.devops.CallElevator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ch.zhaw.iwi.devops.demo.Elevator;


class CallElevator_Test
{
    @Test
    void Test1()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Door opens", Button.call(0, 0));
    }

    @Test
    void Test2()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Upwards", Button.call(1, 2));
    }

    @Test
    void Test3()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Downwards", Button.call(3, -1));
    }

    @Test
    void Test4()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Downwards", Button.call(500, -1));
    }

    @Test
    void Test5()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Downwards", Button.call(-100, -1));
    }

    @Test
    void Test6()
    {
        Elevator Button = new Elevator();
        Assertions.assertNotEquals("Downwards", Button.call(300,1));
    }

    @Test
    void Test7()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Wrong building", Button.call(-2, 500));
    }

    @Test
    void Test8()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Downwards", Button.call(1, 2));
    }
}
