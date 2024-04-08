package ch.zhaw.iwi.devops.demo;

public class Elevator 
{
    public String call (int Start, int Ruf)
    {
        if(Start > 5 | Start < -2)
        {
            Start = 0;
        }

        if(Start == Ruf)
        {
            return "Door opens";
        }
        return "null";
    }
}
