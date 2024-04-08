package ch.zhaw.iwi.devops.CallElevator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Test
public class CallElevator_Test
{
    public void Test1()
    {
        Elevator Button = new Elevator();
        Assertions.assertEquals("Up", Button.call(0, 4));
    }

    
}
