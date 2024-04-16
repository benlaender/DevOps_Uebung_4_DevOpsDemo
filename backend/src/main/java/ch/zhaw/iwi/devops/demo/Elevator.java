package ch.zhaw.iwi.devops.demo;

public class Elevator 
{
    public String call (int start, int ruf)
    {
        if(start > 5 || start < -2)
        {
            start = 0;
        }

        if(ruf > 5 || ruf < -2)
        {
            return "Wrong building";
        }
        else if(start == ruf)
        {
            return "Door opens";
        }
        else if (start < ruf)
        {
            return "Up";
        }
        else
        {
            return "Down";
        }
    }
}
