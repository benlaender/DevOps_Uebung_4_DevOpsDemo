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

    
}
